
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactus_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class contactus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[UserData],Option[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[UserData], emailSent: Option[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.55*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.main("Welcome to Play")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
  """),format.raw/*4.3*/("""<div class="contact-container slick-slide">
    <img class="img-responsive" src=""""),_display_(/*5.39*/routes/*5.45*/.Assets.versioned("images/contact/contact.png")),format.raw/*5.92*/("""">
    <div class="slide-content "><!-- DEV: PLease add here ability to toggle slide-align-left and slide-align-right classes -->
      <div class="slide-content-inner">
        <div class="hr-custom contact">
          <hr>
          <hr>
        </div>
        <strong class="slide-header">Contact Us</strong>
        <strong class="slide-sub-header"></strong>
        <p></p>
      </div>
    </div>
  </div>
  <div class="contact-form-wraper">
  <div class="container">
    <section id="contact-info" class="contact-sub-wrapper">
      <div class="row">
        <div class="makeSomething">
        """),_display_(/*23.10*/if(emailSent.isDefined)/*23.33*/ {_display_(Seq[Any](format.raw/*23.35*/("""
          """),format.raw/*24.11*/("""<a class="displayMessage" style="display: none"></a>
        """)))}),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""</div>
        <div class="center reach-us">
          <h2>Talk To Us?</h2>
          <p class="lead">Whether you have specific needs or just want to say hello, feel free to send us a message or give us a call.
            We work with our partners across the globe and would definitely have a time overlap with you.</p>
        </div>
      </div>
      <div class="row contact-form">
        <div class="col-md-8 col-sm-8" style="margin-bottom: 30px; font-weight: bold; font-size: 16px;">
          <div class="col-md-12 col-sm-12 bordered-form">
            <form action="/contactform" id="signup-form" name="ashupagal" class="form-wrapper" method="post" role="form" validate="">
              <div class="form-group clearfix">
                <label>First Name</label>
                <input type="text" id="name" name="firstname" required="">
              </div>

              <div class="form-group clearfix">
                <label>Last Name</label>
                <input type="text" id="name" name="lastname" required="">
              </div>

              <div class="form-group clearfix">
                <label>Phone Number</label>
                <input type="text" id="name" name="phone" required="">
              </div>

              <div class="form-group clearfix">
                <label>Email</label>
                <input type="email" name="email" id="user-email" required="">
              </div>

              <div class="form-group clearfix">
                <label>Message</label>
                <textarea name="message" id="message" required="" style="min-height: 90px;"></textarea>
              </div>
              <div class="form-group clearfix">
                <input type="submit" value="Send" class="btn btn-primary leave-message-btn">
              </div>
            </form>
          </div>

        </div>

        <div class="col-md-1 col-sm-1" style="height:555px;">
            <div class="divider"></div>
        </div>
        """),format.raw/*91.17*/("""
        """),format.raw/*92.9*/("""<div class="col-md-3 col-sm-3 location">
          <h2>ions</h2>
          <p class="adr clearfix">
            <i class="fa fa-map-marker pull-left"></i>
            <span class="adr-group pull-left">
              <span class="street-address">A-4, PS Arcade,</span><br>
              <span class="region">Bhoja Market, Sector-27.</span><br>
              <span class="postal-code">Noida-201301.</span><br>
              <span class="country-name"><b >India</b></span>
            </span>
          </p>
          <p class="tel"><i class="fa fa-phone"></i>+91-956038636</p>
          <p class="tel"><i class="fa fa-phone"></i>+91 120 2542066</p>
          <p class="email"><i class="fa fa-envelope"></i> contact@anaraconsultant.com </p>

          <p class="adr clearfix" style="margin-top:50px">
            <i class="fa fa-map-marker pull-left"></i>
            <span class="adr-group pull-left">
              <span class="street-address">P.O Box-3214,</span><br>
              <span class="region">Ruwi 112,</span><br>
              <span class="postal-code">Muscat</span><br>
              <span class="country-name"><b>Sultanate of Oman</b></span>
            </span>
          </p>
          <p class="tel"><i class="fa fa-phone"></i>+96894401731</p>
          <p class="email"><i class="fa fa-envelope"></i> info@anaraconsultant.com </p>

        </div>
      </div>
    </section>
  </div>
  </div>
  <section id="contact-info" style="padding:40px 0px 0px; background: #f8f8f8">
      <div class="center">
        <h2>How To Reach Us?</h2>
    </div>
    </section>
  <section class="wrapper" style="margin:0px; padding:0px">
      <div class="gmap-area">
          <div class="row" style="margin-right:3px; margin-left:1px">

              <div class="gmap">
                <iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=AnaraConsultant,+PSArcade,+sector27+noida,+Uttar pradesh&amp;aq=0&amp;oq=Anaraconsultant&amp;sll=37.0625,-95.677068&amp;sspn=42.766543,80.332031&amp;ie=utf8&amp;hq=Anaraconsultant,&amp;hnear=sector27,+Noida,+Uttar Pradesh,+India&amp;ll=28.5751,77.3281&amp;spn=0.001515,0.002452&amp;t=m&amp;z=14&amp;iwloc=a&amp;cid=15820373574503516669&amp;output=embed"></iframe>
              </div>
          </div>
      </div>
  </section>
""")))}))
      }
    }
  }

  def render(userForm:Form[UserData],emailSent:Option[String]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,emailSent)

  def f:((Form[UserData],Option[String]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,emailSent) => apply(userForm,emailSent)

  def ref: this.type = this

}


}

/**/
object contactus extends contactus_Scope0.contactus
              /*
                  -- GENERATED --
                  DATE: Thu Nov 17 00:04:20 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/contactus.scala.html
                  HASH: e598192b9cf653bcca0ce820c30baa9a21e802ca
                  MATRIX: 558->2|706->55|733->57|745->62|782->91|821->93|850->96|958->178|972->184|1039->231|1669->834|1701->857|1741->859|1780->870|1873->932|1909->941|3915->3784|3951->3793
                  LINES: 20->2|25->2|26->3|26->3|26->3|26->3|27->4|28->5|28->5|28->5|46->23|46->23|46->23|47->24|48->25|49->26|95->91|96->92
                  -- GENERATED --
              */
          