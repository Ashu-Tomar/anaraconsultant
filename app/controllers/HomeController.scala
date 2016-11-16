package controllers

import javax.inject._
import com.typesafe.config.ConfigFactory
import play.api._
import play.api.mvc._
import play.api.data.Forms._
import play.api.data.validation.{Valid, ValidationError, Invalid, Constraint}
import play.api.data.{Form, Mapping}

/*import play.libs.mailer.MailerClient*/

/*import com.github.sendgrid.SendGrid*/

import play.api.libs.mailer._
import java.io.File
import org.apache.commons.mail.EmailAttachment


/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
case class UserData(firstname: String, lastname: String, phone: Long, email: String, message: String)

@Singleton
class HomeController @Inject()(mailerClient: MailerClient) extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.index.apply(Application.userForm, None))
  }

  def about = Action {
    Ok(views.html.about(""))
  }

  def contactus = Action {
    Ok(views.html.contactus.apply(Application.userForm, None))
  }

  def services = Action {
    Ok(views.html.services(""))
  }
  def pagenotfound = Action {
    Ok(views.html.pagenotfound(""))
  }
  def submitData = Action { implicit request =>
    Application.userForm.bindFromRequest.fold(
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        BadRequest("sorry has some errors in forms " + formWithErrors)
      },
      userData => {
        /* binding success, you get the actual value. */
        val first_name: String = userData.firstname
        val last_name: String = userData.lastname
        val email: String = userData.email
        val phone_number: Long = userData.phone
        val message: String = userData.message
        sendEmail(first_name, last_name, email, phone_number, message)


        Ok(views.html.index(Application.userForm, Some("emailSent")))
      }
    )
  }
  def contactsubmitData = Action { implicit request =>
    Application.userForm.bindFromRequest.fold(
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        BadRequest("sorry has some errors in forms " + formWithErrors)
      },
      userData => {
        /* binding success, you get the actual value. */
        val first_name: String = userData.firstname
        val last_name: String = userData.lastname
        val email: String = userData.email
        val phone_number: Long = userData.phone
        val message: String = userData.message
        sendEmail(first_name, last_name, email, phone_number, message)

        Ok(views.html.contactus(Application.userForm, Some("emailSent")))
      }
    )
  }


  def sendEmail(first_name: String, last_name: String, email_address: String, phone_number: Long, message: String): String = {
    val cid = "1234"
    val portalConfig = ConfigFactory.load("application")
    val mailerObj = portalConfig.getObject("play.mailer")
    val smtpFrom = mailerObj.get("from").unwrapped().toString
    println(":::::::::::::::::: smtp from address " + smtpFrom)

    val email = Email(
      "Simple email",
      s"Anara new <anurag@knoldus.com>",
      Seq(s"Miss TO <ashutomer41@gmail.com>"),
      // adds attachment
      /* attachments = Seq(
         AttachmentFile("attachment.pdf", new File("/some/path/attachment.pdf")),
         // adds inline attachment from byte array
         AttachmentData("data.txt", "data".getBytes, "text/plain", Some("Simple data"), Some(EmailAttachment.INLINE)),
         // adds cid attachment
         AttachmentFile("image.jpg", new File("/some/path/image.jpg"), contentId = Some(cid))
       ),*/
      // sends text, HTML or both...

      bodyText = Some(s"Hi Rahul," + "\n" +
        s"" +
        s"Here is a new candidate from Your website " + "\n" +
        s"Full Name : $first_name $last_name." + "\n" +
        s"Email : = $email_address" + "\n" +
        s"phone number : $phone_number" + "\n" +
        s"Message : $message ." + "\n" +
        s"Thanks"),

      /*bodyText = Some(s"Hii Rahul," +
        s"" +
        s"Here is a new candidate $first_name $last_name." +
        s"Here is the message from $first_name is $message ." +
        s"If you want to contact here is the details : email = $email_address , phone number : $phone_number" +
        s"Thanks")*/

      bodyHtml = Some(
        s"""<html><body>
              <h3>Hi Rahul</h3>
              <p>Here is a new candidate from Your website</p>
              <p><b>Full Name</b> : $first_name $last_name</p>
              <p><b>Email</b> : $email_address</p>
              <p><b>Phone Number</b> :  $phone_number</p>
              <p><b>Messgage</b> : $message</p>
            </body></html>""".stripMargin)
    )
    mailerClient.send(email)

  }

  /*def sendEmailForShare(email: String, user: String): Option[String] = {
    val sendGridUser = new SendGrid(username, password)

    /*val body = share format user
    sendGridUser.setFromName("Land O'Frost Movie Offer")
    sendGridUser.setSubject("Land O'Frost Movie Offer")
    sendGridUser.addTo(email)
    sendGridUser.setFrom("support@receiptprocessor.com")
    sendGridUser.setHtml(body)

    try {
      Some(sendGridUser.send)
    } catch {
      case ex: Exception =>
        ex.printStackTrace()
        None
    }*/
  }
*/

}

object Application {

  val userForm = Form(
    mapping(
      "firstname" -> nonEmptyText,
      "lastname" -> text,
      "phone" -> longNumber,
      "email" -> nonEmptyText,
      "message" -> nonEmptyText
    )(UserData.apply)(UserData.unapply)
  )

}


