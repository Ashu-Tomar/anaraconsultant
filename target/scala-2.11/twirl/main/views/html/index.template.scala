
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
                                <div class="col-md-offset-3 col-md-6">
                                    <div class="carousel-content">
                                        <h1 class="animation animated-item-1" style="color:#000">
                                            ANARA  """),format.raw/*24.126*/("""</h1>
                                        <h2 class="animation animated-item-2">
                                            Hire the right candidate or Pick your dream job</h2>
                                         """),format.raw/*27.139*/("""
                                        """),format.raw/*28.41*/("""<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                            Talk To Our Experts
                                        </button>

                                    </div>
                                </div>
                                """),format.raw/*38.41*/("""
                            """),format.raw/*39.29*/("""</div>
                        <"""),format.raw/*57.41*/("""
                                    """),format.raw/*72.45*/("""
                            """),format.raw/*73.29*/("""</div>
                        </div>
                    </div>
                </div>
        </section>
        <section id="recent-works">
            <div class="container">
                <div class="center wow fadeInDown">
                    <div class="col-md-4 col-sm-12">
                        <img class="img-responsive" src=""""),_display_(/*82.59*/routes/*82.65*/.Assets.versioned("images/Anara_L.png")),format.raw/*82.104*/("""">
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
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-cogs feature-wrap-wdt-hover"></i>
                                <h2>Civil, Mechanical & Electrical Engg</h2>
                                <h3> Mechanical, Civil, Electrical</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-home feature-wrap-wdt-hover"></i>
                                <h2>Hospitality Industry</h2>
                                <h3>Hotels, Motels, Resorts, Restaurants, Cruises</h3>
                            </div>
                        </div><!--/.col-md-4-->

                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-medkit feature-wrap-wdt-hover"></i>
                                <h2>Medical</h2>
                                <h3>Hospitals, Nursing Homes, Old Age Homes</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-dropbox feature-wrap-wdt-hover"></i>
                                <h2>Information Technology</h2>
                                <h3>Hardware, Software, Telecommunications</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-tint feature-wrap-wdt-hover"></i>
                                <h2>Oil & Gas Field Operation Personnel</h2>
                                <h3>Mechanical, Civil, Electrical, Electro-Mechanical, Pipeline</h3>
                            </div>
                        </div><!--/.col-md-4-->
                        <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                            <div id="feature-wrap">
                                <i id="icl" class="fa fa-plane feature-wrap-wdt-hover"></i>
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
                            <img class="img-responsive asrain-image" alt=" salem" src=""""),_display_(/*173.89*/routes/*173.95*/.Assets.versioned("images/partners/salem.png")),format.raw/*173.141*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://galfar.com/" target="_blank">
                            <img class="img-responsive" alt="galfar" src=""""),_display_(/*178.76*/routes/*178.82*/.Assets.versioned("images/partners/galfar-logo.png")),format.raw/*178.134*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://assarain.com/" target="_blank">
                            <img class="img-responsive asrain-image" alt="assrain" src=""""),_display_(/*183.90*/routes/*183.96*/.Assets.versioned("images/partners/assarain-logo.gif")),format.raw/*183.150*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://algharbiagroup.com/" target="_blank">
                            <img class="img-responsive gharbia" alt="partners" src=""""),_display_(/*188.86*/routes/*188.92*/.Assets.versioned("images/partners/gharbia.jpg")),format.raw/*188.140*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://www.ohigroup.com/newsite/" target="_blank">
                            <img class="ohi-image img-responsive" alt="" src=""""),_display_(/*193.80*/routes/*193.86*/.Assets.versioned("images/partners/ohi.jpg")),format.raw/*193.130*/("""" height="105px">
                        </a>
                    </li>
                    <li class="client-logo">
                        <a class="change-image" href="http://omanshapoorji.com/" target="_blank">
                            <img class="some-image img-responsive" alt="starbucks" src=""""),_display_(/*198.90*/routes/*198.96*/.Assets.versioned("images/partners/osco.png")),format.raw/*198.141*/("""" height="105px">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <section id="conatcat-info">
            <div class="container">
                <h3>We recruit and outsource for different location such as <b>
                    Dubai, Kuwait, U.A.E, Oman, Libya, Qatar, Bahrain, Iraq, Jordan, Saudi Arabia, other
                    Middle East and Gulf countries</b></h3>
                    <div class="section-content section-alter knoldus-section-content" style="padding:0">
                        <ul class="place-list">
                            <li><a href="#"><img src=""""),_display_(/*211.56*/routes/*211.62*/.Assets.versioned("images/flags/india.gif")),format.raw/*211.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*212.56*/routes/*212.62*/.Assets.versioned("images/flags/dubai.gif")),format.raw/*212.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*213.56*/routes/*213.62*/.Assets.versioned("images/flags/oman.gif")),format.raw/*213.104*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*214.56*/routes/*214.62*/.Assets.versioned("images/flags/qatar.gif")),format.raw/*214.105*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*215.56*/routes/*215.62*/.Assets.versioned("images/flags/libiya.gif")),format.raw/*215.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*216.56*/routes/*216.62*/.Assets.versioned("images/flags/jordan.gif")),format.raw/*216.106*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*217.56*/routes/*217.62*/.Assets.versioned("images/flags/bahrain.gif")),format.raw/*217.107*/(""""></a></li>
                            <li><a href="#"><img src=""""),_display_(/*218.56*/routes/*218.62*/.Assets.versioned("images/flags/saudi.gif")),format.raw/*218.105*/(""""></a></li>
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
                                <input type="text" id="name" name="phone" placeholder=" Phone Number *" pattern="."""),format.raw/*243.115*/("""{"""),format.raw/*243.116*/("""10,"""),format.raw/*243.119*/("""}"""),format.raw/*243.120*/("""" required title="10 characters minimum" maxlength="10">
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

    """)))}),format.raw/*267.6*/("""
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
                  DATE: Thu Nov 17 00:26:09 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/index.scala.html
                  HASH: 44a1b87857844fc547c6b666cc60589679f50f05
                  MATRIX: 636->92|784->145|816->173|847->179|878->202|917->204|953->214|1131->365|1163->388|1203->390|1256->415|1361->489|1406->506|1940->1085|2192->1405|2261->1446|2615->2107|2672->2136|2732->3467|2797->4552|2854->4581|3223->4923|3238->4929|3299->4968|9030->10671|9046->10677|9115->10723|9427->11007|9443->11013|9518->11065|9846->11365|9862->11371|9939->11425|10269->11727|10285->11733|10356->11781|10686->12083|10702->12089|10769->12133|11102->12438|11118->12444|11186->12489|11870->13145|11886->13151|11952->13194|12047->13261|12063->13267|12129->13310|12224->13377|12240->13383|12305->13425|12400->13492|12416->13498|12482->13541|12577->13608|12593->13614|12660->13658|12755->13725|12771->13731|12838->13775|12933->13842|12949->13848|13017->13893|13112->13960|13128->13966|13194->14009|14716->15501|14747->15502|14780->15505|14811->15506|15881->16545
                  LINES: 23->5|28->5|29->6|30->7|30->7|30->7|32->9|35->12|35->12|35->12|36->13|37->14|38->15|47->24|50->27|51->28|57->38|58->39|59->57|60->72|61->73|70->82|70->82|70->82|161->173|161->173|161->173|166->178|166->178|166->178|171->183|171->183|171->183|176->188|176->188|176->188|181->193|181->193|181->193|186->198|186->198|186->198|199->211|199->211|199->211|200->212|200->212|200->212|201->213|201->213|201->213|202->214|202->214|202->214|203->215|203->215|203->215|204->216|204->216|204->216|205->217|205->217|205->217|206->218|206->218|206->218|231->243|231->243|231->243|231->243|255->267
                  -- GENERATED --
              */
          