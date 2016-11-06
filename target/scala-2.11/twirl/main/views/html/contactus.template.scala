
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

class contactus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Welcome to Play")/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
  """),format.raw/*3.3*/("""<div class="contact-container slick-slide">
    <img class="img-responsive" src=""""),_display_(/*4.39*/routes/*4.45*/.Assets.versioned("images/contact/contact.png")),format.raw/*4.92*/("""">
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
        <div class="center reach-us">
          <h2>How to Reach Us?</h2>
          <p class="lead">Whether you have specific needs or just want to say hello, feel free to send us a message or give us a call.
            We work with our partners across the globe and would definitely have a time overlap with you.</p>
        </div>
      </div>
      <div class="row contact-form">
        <div class="col-md-8 col-sm-8" style="margin-bottom: 30px; font-weight: bold; font-size: 16px;">
          <div class="col-md-12 col-sm-12 bordered-form">
            <form action="/" id="engage-knoldus-form" class="form-wrapper" method="post" role="form" validate="">
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

        <div class="col-md-1 col-sm-1" style="height: 670px;">
            <div class="divider"></div>
        </div>
        <div class="col-md-3 col-sm-3 location">
          <h2>ions</h2>
          <div class="sidebar-block">
            <div class="sidebar-icon-item">
             Knoldus House <br> 10/19, Ground Floor<br> West Patel
              Nagar, New Delhi - 110008 <br> India
            </div>
          </div>
          <div class="sidebar-block">
            <div class="sidebar-icon-item">
              Ram Indukuri<br>
              Knoldus Inc<br>
              56 N, Averry Ct  <br> Palatine(Chicago), IL - 60067<br>USA
              <i class="icon-phone"></i> +(1) 312-890-2448
            </div>
            <div class="sidebar-icon-item">
              <i class="icon-envelope-alt"></i> ram.com
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
  </div>
  <section class="wrapper">
      <div class="gmap-area">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center">
              <div class="gmap">
                <iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=JoomShaper,+Dhaka,+Dhaka+Division,+Bangladesh&amp;aq=0&amp;oq=joomshaper&amp;sll=37.0625,-95.677068&amp;sspn=42.766543,80.332031&amp;ie=UTF8&amp;hq=JoomShaper,&amp;hnear=Dhaka,+Dhaka+Division,+Bangladesh&amp;ll=23.73854,90.385504&amp;spn=0.001515,0.002452&amp;t=m&amp;z=14&amp;iwloc=A&amp;cid=1073661719450182870&amp;output=embed"></iframe>
              </div>
            </div>
          </div>
        </div>
      </div>
  </section>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object contactus extends contactus_Scope0.contactus
              /*
                  -- GENERATED --
                  DATE: Thu Oct 27 16:22:58 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/contactus.scala.html
                  HASH: 540b27fd733ec1dafda360f86251633ba20fb1a9
                  MATRIX: 535->1|647->18|674->20|686->25|723->54|762->56|791->59|899->141|913->147|980->194
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|28->4|28->4|28->4
                  -- GENERATED --
              */
          