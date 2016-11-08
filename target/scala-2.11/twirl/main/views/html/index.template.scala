
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[UserData],Option[String],play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(userForm: Form[UserData], emailSent: Option[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.55*/("""
    """),format.raw/*6.28*/("""
    """),_display_(/*7.6*/main("Welcome to Play")/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""

        """),format.raw/*9.9*/("""<section id="main-slider" class="no-margin">
            <div class="carousel slide">
                <div class="makeSomething">
                    """),_display_(/*12.22*/if(emailSent.isDefined)/*12.45*/ {_display_(Seq[Any](format.raw/*12.47*/("""
                        """),format.raw/*13.25*/("""<a class="displayMessage" style="display: none"></a>
                    """)))}),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""</div>

                <div class="carousel-inner">
                    <div class="item active slide-first">
                        <div class="container">
                            <div class="row slide-margin">
                                <"""),format.raw/*52.41*/("""
                                    """),format.raw/*53.37*/("""<div class="col-sm-6">
                                        <div class="carousel-content">
                                            <h1 class="animation animated-item-1">ANARA </h1>
                                            <h2 class="animation animated-item-2">Hire the right candidate or Pick your dream job</h2>
                                            <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                                Sign up
                                            </button>
                                        </div>
                                    </div>

                                    <div class="col-sm-6 hidden-xs animation animated-item-4">
                                        <div class="slider-img">
                                            <img src=""""),_display_(/*65.56*/routes/*65.62*/.Assets.versioned("images/slider/img1.png")),format.raw/*65.105*/("""" class="img-responsive">
                                        </div>
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="recent-works">
            <div class="container">
                <div class="center wow fadeInDown">
                    <div class="col-md-4 col-sm-12">
                        <img class="img-responsive" src=""""),_display_(/*78.59*/routes/*78.65*/.Assets.versioned("images/Anara_L.png")),format.raw/*78.104*/("""">
                    </div>
                    <div class="col-md-8 col-sm-12">
                        <h2>About <span style="color:#f3760a ;">AnaraConsultant</span></h2>
                        <div class="row team-bar text-center">
                            <div class="first-arrow hidden-xs">
                                <hr>
                            </div>
                            <div class="second-arrow hidden-xs">
                                <hr> <i class="fa fa-angle-down"></i>
                            </div>
                        </div>
                        <div class="lead">
                            <p>
                            ANARA CONSULTANT, a foremost manpower consulting firm based in Delhi NCR, we are proud of being one of the best in the industry with an overall experience of 30 years, providing end to end recruitment solutions across multiple industries. Anara consultant is backed by some of the best professionals of the trade, making the whole process hassle free. We are a human resource oriented company and have enjoyed a position of emerging eminence in the field of recruitment of both  technical and non technical personnel for organisations abroad.
                            We are a company driven by ideals, a company that prides itself upon 30 glorious years of providing global clients with the most outstanding
                            </p>
                        <p style="text-align:center ;">
                            manpower in the world.
                        </p>
                        </div>    
                        <a class="btn btn-primary" href="">Know More</a>
                    </div>
                </div>
            </div>
        </section>


        <section id="feature" >
            <div class="container">
                <div class="center wow fadeInDown">
                    <h2>Area of Expertise</h2>
                    <p class="lead"> Anara is expertise to hire right candidates in enoromous area  are <br> </p>
                </div>

                <div class="row">
                    <div class="features">
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-cogs feature-wrap-wdt-hover"></i>
                                <h2>Civil, Mechanical & Electrical Engg</h2>
                                <h3> Mechanical, Civil, Electrical</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-home feature-wrap-wdt-hover"></i>
                                <h2>Hospitality Industry</h2>
                                <h3>Hotels, Motels, Resorts, Restaurants, Cruises</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-medkit feature-wrap-wdt-hover"></i>
                                <h2>Medical</h2>
                                <h3>Hospitals, Nursing Homes, Old Age Homes</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-dropbox feature-wrap-wdt-hover"></i>
                                <h2>Information Technology</h2>
                                <h3>Hardware, Software, Telecommunications</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-tint feature-wrap-wdt-hover"></i>
                                <h2>Oil & Gas Field Operation Personnel</h2>
                                <h3>Mechanical, Civil, Electrical, Electro-Mechanical, Pipeline</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-plane feature-wrap-wdt-hover"></i>
                                <h2>Aeronautical Engineers & General</h2>
                                <h3>Administration, Production, Maintenance, Technical</h3>
                            </div><!--/.col-md-4-->
                        </div><!--/.services-->
                    </div><!--/.row-->
                </div><!--/.container-->
            </div>
        </section> <!--/#feature-->
        <div class="section-content" style="">
            <div class="container" id="client">
                <div class="headings">We work with</div>
                <ul>
                    <li class="client-logo">
                        <a class="change-image" href="http://www.salemgroups.com/" target="_blank">
                            <img class="img-responsive asrain-image" alt=" salem" src=""""),_display_(/*169.89*/routes/*169.95*/.Assets.versioned("images/partners/salem.png")),format.raw/*169.141*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://galfar.com/" target="_blank">
                            <img class="img-responsive" alt="galfar" src=""""),_display_(/*174.76*/routes/*174.82*/.Assets.versioned("images/partners/galfar-logo.png")),format.raw/*174.134*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://assarain.com/" target="_blank">
                            <img class="img-responsive asrain-image" alt="assrain" src=""""),_display_(/*179.90*/routes/*179.96*/.Assets.versioned("images/partners/assarain-logo.gif")),format.raw/*179.150*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://algharbiagroup.com/" target="_blank">
                            <img class="img-responsive gharbia" alt="partners" src=""""),_display_(/*184.86*/routes/*184.92*/.Assets.versioned("images/partners/gharbia.jpg")),format.raw/*184.140*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://www.ohigroup.com/newsite/" target="_blank">
                            <img class="ohi-image img-responsive" alt="" src=""""),_display_(/*189.80*/routes/*189.86*/.Assets.versioned("images/partners/ohi.jpg")),format.raw/*189.130*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://omanshapoorji.com/" target="_blank">
                            <img class="some-image img-responsive" alt="starbucks" src=""""),_display_(/*194.90*/routes/*194.96*/.Assets.versioned("images/partners/osco.png")),format.raw/*194.141*/("""" height="105px">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <section id="conatcat-info">
            <div class="container">
                <h3>We recruit and outsource for different location such as <b>
                    Iraq, Jordan, Saudi Arabia, Dubai, Kuwait, U.A.E, Oman, Libya, Qatar, Bahrain, other
                    Middle East and Gulf countries</b></h3>
                    <div class="section-content section-alter knoldus-section-content" style="padding:0">
                        <ul class="place-list">
                            <li><a href="#"><img src=""""),_display_(/*207.56*/routes/*207.62*/.Assets.versioned("images/flags/india.gif")),format.raw/*207.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*208.56*/routes/*208.62*/.Assets.versioned("images/flags/dubai.gif")),format.raw/*208.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*209.56*/routes/*209.62*/.Assets.versioned("images/flags/oman.gif")),format.raw/*209.104*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*210.56*/routes/*210.62*/.Assets.versioned("images/flags/qatar.gif")),format.raw/*210.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*211.56*/routes/*211.62*/.Assets.versioned("images/flags/libiya.gif")),format.raw/*211.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*212.56*/routes/*212.62*/.Assets.versioned("images/flags/jordan.gif")),format.raw/*212.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*213.56*/routes/*213.62*/.Assets.versioned("images/flags/bahrain.gif")),format.raw/*213.107*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*214.56*/routes/*214.62*/.Assets.versioned("images/flags/saudi.gif")),format.raw/*214.105*/(""""></a></li>
                        </ul>
                    </div>
            </div><!--/.container-->
        </section> <!--/#conatcat-info-->

            <!-- Modal -->
        <div class="modal popup-open" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Register Yourself</h4>
                    </div>
                    <div class="modal-body">
                        <form action="/widgets" id="signup-form" name="ashupagal" class="form-wrapper" method="post" role="form" validate="">
                            <div class="form-group clearfix">
                                <input type="text" id="name" name="firstname" placeholder=" First Name *" required="">
                            </div>

                            <div class="form-group clearfix">
                                <input type="text" id="name" name="lastname" placeholder=" LastName *" required="">
                            </div>

                            <div class="form-group clearfix">
                                <input type="text" id="name" name="phone" placeholder=" Phone Number *" pattern="."""),format.raw/*239.115*/("""{"""),format.raw/*239.116*/("""10,"""),format.raw/*239.119*/("""}"""),format.raw/*239.120*/("""" required title="10 characters minimum" maxlength="10">
                            </div>

                            <div class="form-group clearfix">
                                    <!-- type email used by jquery validate -->
                                <input type="email" id="email" name="email" placeholder="E-mail *" required="">
                            </div>

                            <div class="form-group clearfix">
                                    <!-- type email used by jquery validate -->
                                <textarea name="message" id="message" placeholder="Your Message" required="" style="min-height: 90px ;"></textarea>
                            </div>


                            <div class="form-group clearfix">

                                <input type="submit" value="Send" class="btn btn-primary leave-message-btn">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*263.6*/("""
"""))
      }
    }
  }

  def render(userForm:Form[UserData],emailSent:Option[String]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,emailSent)

  def f:((Form[UserData],Option[String]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,emailSent) => apply(userForm,emailSent)

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 13:39:17 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/index.scala.html
                  HASH: 1bd14b278f1faddd273f851f591358751d218f82
                  MATRIX: 636->92|784->145|816->173|847->179|878->202|917->204|953->214|1131->365|1163->388|1203->390|1256->415|1361->489|1406->506|1685->3102|1750->3139|2657->4019|2672->4025|2737->4068|3269->4573|3284->4579|3345->4618|9040->10285|9056->10291|9125->10337|9437->10621|9453->10627|9528->10679|9856->10979|9872->10985|9949->11039|10279->11341|10295->11347|10366->11395|10696->11697|10712->11703|10779->11747|11112->12052|11128->12058|11196->12103|11880->12759|11896->12765|11962->12808|12057->12875|12073->12881|12139->12924|12234->12991|12250->12997|12315->13039|12410->13106|12426->13112|12492->13155|12587->13222|12603->13228|12670->13272|12765->13339|12781->13345|12848->13389|12943->13456|12959->13462|13027->13507|13122->13574|13138->13580|13204->13623|14726->15115|14757->15116|14790->15119|14821->15120|15891->16159
                  LINES: 23->5|28->5|29->6|30->7|30->7|30->7|32->9|35->12|35->12|35->12|36->13|37->14|38->15|44->52|45->53|57->65|57->65|57->65|70->78|70->78|70->78|161->169|161->169|161->169|166->174|166->174|166->174|171->179|171->179|171->179|176->184|176->184|176->184|181->189|181->189|181->189|186->194|186->194|186->194|199->207|199->207|199->207|200->208|200->208|200->208|201->209|201->209|201->209|202->210|202->210|202->210|203->211|203->211|203->211|204->212|204->212|204->212|205->213|205->213|205->213|206->214|206->214|206->214|231->239|231->239|231->239|231->239|255->263
                  -- GENERATED --
              */
          