
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
                                <div class="col-xs-offset-1 col-md-offset-3 col-sm-6">
                                    <div class="carousel-content">
                                        <h1 class="animation animated-item-1">
                                            ANARA  """),format.raw/*25.126*/("""</h1>
                                        <h2 class="animation animated-item-2">
                                            Hire the right candidate or Pick your dream job</h2>
                                        """),format.raw/*28.138*/("""
                                        """),format.raw/*29.41*/("""<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                            Sign up
                                        </button>

                                    </div>
                                </div>
                                """),format.raw/*39.41*/("""
                            """),format.raw/*40.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="recent-works">
            <div class="container">
                <div class="center wow fadeInDown">
                    <div class="col-md-4 col-sm-12">
                        <img src=""""),_display_(/*50.36*/routes/*50.42*/.Assets.versioned("images/Anara_L.png")),format.raw/*50.81*/("""" class="img-responsive">
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
                                <i class="fa fa-cogs"></i>
                                <h2>Civil, Mechanical & Electrical Engg</h2>
                                <h3> Mechanical, Civil, Electrical</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-home"></i>
                                <h2>Hospitality Industry</h2>
                                <h3>Hotels, Motels, Resorts, Restaurants, Cruises</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-medkit"></i>
                                <h2>Medical</h2>
                                <h3>Hospitals, Nursing Homes, Old Age Homes</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-dropbox "></i>
                                <h2>Information Technology</h2>
                                <h3>Hardware, Software, Telecommunications</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-tint"></i>
                                <h2>Oil & Gas Field Operation Personnel</h2>
                                <h3>Mechanical, Civil, Electrical, Electro-Mechanical, Pipeline</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div class="feature-wrap">
                                <i class="fa fa-plane"></i>
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
                            <img alt=" salem" src=""""),_display_(/*141.53*/routes/*141.59*/.Assets.versioned("images/partners/salem.png")),format.raw/*141.105*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://galfar.com/" target="_blank">
                            <img alt="galfar" src=""""),_display_(/*146.53*/routes/*146.59*/.Assets.versioned("images/partners/galfar-logo.png")),format.raw/*146.111*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://assarain.com/" target="_blank">
                            <img alt="assrain" src=""""),_display_(/*151.54*/routes/*151.60*/.Assets.versioned("images/partners/assarain-logo.gif")),format.raw/*151.114*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://algharbiagroup.com/" target="_blank">
                            <img alt="partners" src=""""),_display_(/*156.55*/routes/*156.61*/.Assets.versioned("images/partners/gharbia.jpg")),format.raw/*156.109*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://www.ohigroup.com/newsite/" target="_blank">
                            <img class="ohi-image" alt="" src=""""),_display_(/*161.65*/routes/*161.71*/.Assets.versioned("images/partners/ohi.jpg")),format.raw/*161.115*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://omanshapoorji.com/" target="_blank">
                            <img class="some-image" alt="starbucks" src=""""),_display_(/*166.75*/routes/*166.81*/.Assets.versioned("images/partners/osco.png")),format.raw/*166.126*/("""" height="105px">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <section id="conatcat-info">
            <div class="container">
                    <div class="section-content section-alter knoldus-section-content" style="padding:0">
                        <ul class="place-list">
                            <li><a href="#"><img src=""""),_display_(/*176.56*/routes/*176.62*/.Assets.versioned("images/flags/india.gif")),format.raw/*176.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*177.56*/routes/*177.62*/.Assets.versioned("images/flags/bahrain.gif")),format.raw/*177.107*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*178.56*/routes/*178.62*/.Assets.versioned("images/flags/dubai.gif")),format.raw/*178.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*179.56*/routes/*179.62*/.Assets.versioned("images/flags/oman.gif")),format.raw/*179.104*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*180.56*/routes/*180.62*/.Assets.versioned("images/flags/qatar.gif")),format.raw/*180.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*181.56*/routes/*181.62*/.Assets.versioned("images/flags/libiya.gif")),format.raw/*181.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*182.56*/routes/*182.62*/.Assets.versioned("images/flags/jordan.gif")),format.raw/*182.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*183.56*/routes/*183.62*/.Assets.versioned("images/flags/saudi.gif")),format.raw/*183.105*/(""""></a></li>
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
                                <input type="text" id="name" name="phone" placeholder=" Phone Number *" pattern="."""),format.raw/*208.115*/("""{"""),format.raw/*208.116*/("""10,"""),format.raw/*208.119*/("""}"""),format.raw/*208.120*/("""" required title="10 characters minimum" maxlength="10">
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

    """)))}),format.raw/*232.6*/("""
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
                  DATE: Sat Nov 05 19:56:43 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/index.scala.html
                  HASH: 8bba7cdf33ca358ef7c039364de2de64944e2023
                  MATRIX: 636->92|784->145|816->173|847->179|878->202|917->204|953->214|1131->365|1163->388|1203->390|1256->415|1361->489|1406->506|1938->1083|2189->1402|2258->1443|2600->2072|2657->2101|3022->2439|3037->2445|3097->2484|8642->8001|8658->8007|8727->8053|9016->8314|9032->8320|9107->8372|9399->8636|9415->8642|9492->8696|9791->8967|9807->8973|9878->9021|10193->9308|10209->9314|10276->9358|10594->9648|10610->9654|10678->9699|11117->10110|11133->10116|11199->10159|11294->10226|11310->10232|11378->10277|11473->10344|11489->10350|11555->10393|11650->10460|11666->10466|11731->10508|11826->10575|11842->10581|11908->10624|12003->10691|12019->10697|12086->10741|12181->10808|12197->10814|12264->10858|12359->10925|12375->10931|12441->10974|13963->12466|13994->12467|14027->12470|14058->12471|15128->13510
                  LINES: 23->5|28->5|29->6|30->7|30->7|30->7|32->9|35->12|35->12|35->12|36->13|37->14|38->15|48->25|51->28|52->29|58->39|59->40|69->50|69->50|69->50|160->141|160->141|160->141|165->146|165->146|165->146|170->151|170->151|170->151|175->156|175->156|175->156|180->161|180->161|180->161|185->166|185->166|185->166|195->176|195->176|195->176|196->177|196->177|196->177|197->178|197->178|197->178|198->179|198->179|198->179|199->180|199->180|199->180|200->181|200->181|200->181|201->182|201->182|201->182|202->183|202->183|202->183|227->208|227->208|227->208|227->208|251->232
                  -- GENERATED --
              */
          