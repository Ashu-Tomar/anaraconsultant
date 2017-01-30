
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<link href='//fonts.googleapis.com/css?family=Quicksand|Open+Sans:400,600|Montserrat:400,700|Poiret+One|Josefin+Sans|Raleway' rel='stylesheet' type='text/css'>
        <meta name="google-site-verification" content="ZH2yvt6jWmNHrjSwkYac1IH3XVxXCaJ5SdGCdcsOq4Q"/>
        <title>AnaraConsultant</title>
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*16.70*/("""" rel="stylesheet">
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*17.73*/("""" rel="stylesheet">
        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.versioned("css/animate.min.css")),format.raw/*18.68*/("""" rel="stylesheet">
        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.versioned("css/prettyPhoto.css")),format.raw/*19.68*/("""" rel="stylesheet">
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("css/main.css")),format.raw/*20.61*/("""" rel="stylesheet">
        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("css/responsive.css")),format.raw/*21.67*/("""" rel="stylesheet">
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("css/sweetalert.css")),format.raw/*22.67*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*23.59*/routes/*23.65*/.Assets.versioned("images/favicon.png")),format.raw/*23.104*/("""">
        <link href=""""),_display_(/*24.22*/routes/*24.28*/.Assets.versioned("css/services.css")),format.raw/*24.65*/("""" rel="stylesheet">
        <link href=""""),_display_(/*25.22*/routes/*25.28*/.Assets.versioned("css/custom.css")),format.raw/*25.63*/("""" rel="stylesheet">

    </head>
    <body>
        """),format.raw/*30.31*/("""
        """),format.raw/*31.9*/("""<header id="header">
            <nav class="navbar navbar-inverse" role="banner">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.html"><img src=""""),_display_(/*41.78*/routes/*41.84*/.Assets.versioned("images/anara-logo.png")),format.raw/*41.126*/("""" alt="logo" height="65px"></a>
                    </div>

                    <div class="collapse navbar-collapse navbar-right">
                        <ul id="navbar" class="nav navbar-nav">
                            <li><a href=""""),_display_(/*46.43*/routes/*46.49*/.HomeController.index()),format.raw/*46.72*/("""">Home</a></li>
                            <li><a href=""""),_display_(/*47.43*/routes/*47.49*/.HomeController.about()),format.raw/*47.72*/("""">About Us</a></li>
                            <li><a href=""""),_display_(/*48.43*/routes/*48.49*/.HomeController.services()),format.raw/*48.75*/("""">Services</a></li>
                            <li><a href=""""),_display_(/*49.43*/routes/*49.49*/.HomeController.pagenotfound()),format.raw/*49.79*/("""">Current oppurinities</a></li>
                            <li><a href=""""),_display_(/*50.43*/routes/*50.49*/.HomeController.contactus()),format.raw/*50.76*/("""">Contact Us</a></li>
                        </ul>
                    </div>
                </div><!--/.container-->
            </nav><!--/nav-->

        </header><!--/header-->

        """),_display_(/*58.10*/content),format.raw/*58.17*/("""
        """),format.raw/*59.9*/("""<section class="bg-gray">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="col-md-4 bg-gray-text">
                            <h2>Anaraconsultant</h2>
                            <p style="width:250px; margin-top:20px">We, Anara Consultant, have expertise in offering services
                                for Overseas Recruitment. As job seekers, you can rely upon
                                us for overseas placements in various sectors.</p>
                            <p>We have set up a wide network spread overseas in order to serve you in
                                getting jobs in your area of interest.</p>
                        </div>
                        <div class="col-md-4">
                            <h2>Links</h2>
                            <ul>
                                <li><i class="fa fa-arrow-circle-o-right"></i><a href=""""),_display_(/*74.89*/routes/*74.95*/.HomeController.index()),format.raw/*74.118*/("""">Home</a> </li>
                                <li><i class="fa fa-arrow-circle-o-right"></i><a href=""""),_display_(/*75.89*/routes/*75.95*/.HomeController.about()),format.raw/*75.118*/("""">About Us</a> </li>
                                <li><i class="fa fa-arrow-circle-o-right"></i><a href=""""),_display_(/*76.89*/routes/*76.95*/.HomeController.contactus()),format.raw/*76.122*/("""">Contact Us</a></li>
                                <li><i class="fa fa-arrow-circle-o-right"></i><a href=""""),_display_(/*77.89*/routes/*77.95*/.HomeController.services()),format.raw/*77.121*/("""">Services</a></li>
                                <li><i class="fa fa-arrow-circle-o-right"></i><a href=""""),_display_(/*78.89*/routes/*78.95*/.HomeController.pagenotfound()),format.raw/*78.125*/("""">Current Oppurtuinities</a></li>
                            </ul>
                        </div>
                        <div class="col-md-4">
                            <h2>Address</h2>
                            <p class="adr clearfix">
                                <i class="fa fa-map-marker pull-left"></i>
                                <span class="adr-group pull-left">
                                    <span class="street-address">A-4, PS Arcade,</span><br>
                                    <span class="region">Bhoja Market, Sector-27.</span><br>
                                    <span class="postal-code">Noida-201301.</span><br>
                                    <span class="country-name"><b >India</b></span>
                                </span>
                            </p>
                            <p class="tel"><i class="fa fa-phone"></i>+91-9560638436</p>
                            <p class="tel"><i class="fa fa-phone"></i>+91 120 2542066</p>
                            <p class="email"><i class="fa fa-envelope"></i> contact@anaraconsultant.com </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <footer id="footer" class="midnight-blue">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 text-center">
                            &copy; copyright 2011 <a target="_blank" href="www.anaraconsultant.com" title="copyright">
                        AnaraConsultant</a>. All Rights Reserved.
                    </div>
                   """),format.raw/*113.29*/("""
                """),format.raw/*114.17*/("""</div>
            </div>
        </footer><!--/#footer-->

        <script src=""""),_display_(/*118.23*/routes/*118.29*/.Assets.versioned("js/jquery.js")),format.raw/*118.62*/(""""></script>
        <script src=""""),_display_(/*119.23*/routes/*119.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*119.69*/(""""></script>
        <script src=""""),_display_(/*120.23*/routes/*120.29*/.Assets.versioned("js/jquery.prettyPhoto.js")),format.raw/*120.74*/(""""></script>
        <script src=""""),_display_(/*121.23*/routes/*121.29*/.Assets.versioned("js/jquery.isotope.min.js")),format.raw/*121.74*/(""""></script>
        <script src=""""),_display_(/*122.23*/routes/*122.29*/.Assets.versioned("js/main.js")),format.raw/*122.60*/(""""></script>
        <script src=""""),_display_(/*123.23*/routes/*123.29*/.Assets.versioned("js/wow.min.js")),format.raw/*123.63*/(""""></script>
        <script src=""""),_display_(/*124.23*/routes/*124.29*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*124.70*/(""""></script>
        <script src=""""),_display_(/*125.23*/routes/*125.29*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*125.70*/(""""></script>
        <script src=""""),_display_(/*126.23*/routes/*126.29*/.Assets.versioned("js/custom.js")),format.raw/*126.62*/(""""></script>
        <script src=""""),_display_(/*127.23*/routes/*127.29*/.Assets.versioned("js/jquery.flip.js")),format.raw/*127.67*/(""""></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 07 16:23:15 IST 2016
                  SOURCE: /home/ashu/Documents/anaraconsultant/app/views/main.scala.html
                  HASH: b20c1722c2b334f2dafcb408cdc8cdbf3a3a4115
                  MATRIX: 779->255|904->285|932->287|1012->392|1048->401|1397->723|1412->729|1475->771|1543->812|1558->818|1624->863|1692->904|1707->910|1768->950|1836->991|1851->997|1912->1037|1980->1078|1995->1084|2049->1117|2117->1158|2132->1164|2192->1203|2260->1244|2275->1250|2335->1289|2440->1367|2455->1373|2516->1412|2567->1436|2582->1442|2640->1479|2708->1520|2723->1526|2779->1561|2859->1702|2895->1711|3579->2368|3594->2374|3658->2416|3923->2654|3938->2660|3982->2683|4067->2741|4082->2747|4126->2770|4215->2832|4230->2838|4277->2864|4366->2926|4381->2932|4432->2962|4533->3036|4548->3042|4596->3069|4816->3262|4844->3269|4880->3278|5880->4251|5895->4257|5940->4280|6072->4385|6087->4391|6132->4414|6268->4523|6283->4529|6332->4556|6469->4666|6484->4672|6532->4698|6667->4806|6682->4812|6734->4842|8393->6880|8439->6897|8549->6979|8565->6985|8620->7018|8682->7052|8698->7058|8760->7098|8822->7132|8838->7138|8905->7183|8967->7217|8983->7223|9050->7268|9112->7302|9128->7308|9181->7339|9243->7373|9259->7379|9315->7413|9377->7447|9393->7453|9456->7494|9518->7528|9534->7534|9597->7575|9659->7609|9675->7615|9730->7648|9792->7682|9808->7688|9868->7726
                  LINES: 25->7|30->7|32->9|35->12|36->13|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|52->30|53->31|63->41|63->41|63->41|68->46|68->46|68->46|69->47|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|72->50|72->50|72->50|80->58|80->58|81->59|96->74|96->74|96->74|97->75|97->75|97->75|98->76|98->76|98->76|99->77|99->77|99->77|100->78|100->78|100->78|129->113|130->114|134->118|134->118|134->118|135->119|135->119|135->119|136->120|136->120|136->120|137->121|137->121|137->121|138->122|138->122|138->122|139->123|139->123|139->123|140->124|140->124|140->124|141->125|141->125|141->125|142->126|142->126|142->126|143->127|143->127|143->127
                  -- GENERATED --
              */
          