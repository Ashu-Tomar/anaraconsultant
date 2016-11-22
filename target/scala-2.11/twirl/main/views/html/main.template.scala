
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
    """),format.raw/*13.5*/("""<link href='//fonts.googleapis.com/css?family=Quicksand|Open+Sans:400,600|Montserrat:400,700|Poiret+One|Josefin+Sans|Raleway' rel='stylesheet' type='text/css'>
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
        """),format.raw/*30.32*/("""
    """),format.raw/*31.5*/("""<header id="header">
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src=""""),_display_(/*41.74*/routes/*41.80*/.Assets.versioned("images/anara-logo.png")),format.raw/*41.122*/("""" alt="logo" height="65px"></a>
                </div>

                <div class="collapse navbar-collapse navbar-right">
                    <ul id="navbar" class="nav navbar-nav">
                        <li><a href=""""),_display_(/*46.39*/routes/*46.45*/.HomeController.index()),format.raw/*46.68*/("""">Home</a></li>
                        <li><a href=""""),_display_(/*47.39*/routes/*47.45*/.HomeController.about()),format.raw/*47.68*/("""">About Us</a></li>
                        <li><a href=""""),_display_(/*48.39*/routes/*48.45*/.HomeController.services()),format.raw/*48.71*/("""">Services</a></li>
                        <li><a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.pagenotfound()),format.raw/*49.75*/("""">Current oppurinities</a></li>
                        <li><a href=""""),_display_(/*50.39*/routes/*50.45*/.HomeController.contactus()),format.raw/*50.72*/("""">Contact Us</a></li>
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->

    </header><!--/header-->

        """),_display_(/*58.10*/content),format.raw/*58.17*/("""

        """),format.raw/*60.9*/("""<footer id="footer" class="midnight-blue">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                            &copy; copyright 2011 <a target="_blank" href="www.anaraconsultant.com" title="copyright">AnaraConsultant</a>. All Rights Reserved.
                    </div>
                    <div class="col-sm-6">
                        <ul class="pull-right">
                            <li><a href=""""),_display_(/*68.43*/routes/*68.49*/.HomeController.index()),format.raw/*68.72*/("""">Home</a></li>
                            <li><a href=""""),_display_(/*69.43*/routes/*69.49*/.HomeController.about()),format.raw/*69.72*/("""">About Us</a></li>
                            <li><a href=""""),_display_(/*70.43*/routes/*70.49*/.HomeController.contactus()),format.raw/*70.76*/("""">Contact Us</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer><!--/#footer-->

        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.versioned("js/jquery.js")),format.raw/*77.62*/(""""></script>
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*78.69*/(""""></script>
        <script src=""""),_display_(/*79.23*/routes/*79.29*/.Assets.versioned("js/jquery.prettyPhoto.js")),format.raw/*79.74*/(""""></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("js/jquery.isotope.min.js")),format.raw/*80.74*/(""""></script>
        <script src=""""),_display_(/*81.23*/routes/*81.29*/.Assets.versioned("js/main.js")),format.raw/*81.60*/(""""></script>
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("js/wow.min.js")),format.raw/*82.63*/(""""></script>
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*83.70*/(""""></script>
        <script src=""""),_display_(/*84.23*/routes/*84.29*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*84.70*/(""""></script>
        <script src=""""),_display_(/*85.23*/routes/*85.29*/.Assets.versioned("js/custom.js")),format.raw/*85.62*/(""""></script>
        <script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("js/jquery.flip.js")),format.raw/*86.67*/(""""></script>

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
                  DATE: Sun Nov 20 18:57:13 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/main.scala.html
                  HASH: f5b95ba06b5ab2bfac7161bcb41c2271caac46e1
                  MATRIX: 784->260|909->290|937->292|1017->397|1049->402|1398->724|1413->730|1476->772|1544->813|1559->819|1625->864|1693->905|1708->911|1769->951|1837->992|1852->998|1913->1038|1981->1079|1996->1085|2050->1118|2118->1159|2133->1165|2193->1204|2261->1245|2276->1251|2336->1290|2441->1368|2456->1374|2517->1413|2568->1437|2583->1443|2641->1480|2709->1521|2724->1527|2780->1562|2860->1704|2892->1709|3536->2326|3551->2332|3615->2374|3864->2596|3879->2602|3923->2625|4004->2679|4019->2685|4063->2708|4148->2766|4163->2772|4210->2798|4295->2856|4310->2862|4361->2892|4458->2962|4473->2968|4521->2995|4721->3168|4749->3175|4786->3185|5289->3661|5304->3667|5348->3690|5433->3748|5448->3754|5492->3777|5581->3839|5596->3845|5644->3872|5848->4049|5863->4055|5917->4088|5978->4122|5993->4128|6054->4168|6115->4202|6130->4208|6196->4253|6257->4287|6272->4293|6338->4338|6399->4372|6414->4378|6466->4409|6527->4443|6542->4449|6597->4483|6658->4517|6673->4523|6735->4564|6796->4598|6811->4604|6873->4645|6934->4679|6949->4685|7003->4718|7064->4752|7079->4758|7138->4796
                  LINES: 25->7|30->7|32->9|35->12|36->13|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|52->30|53->31|63->41|63->41|63->41|68->46|68->46|68->46|69->47|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|72->50|72->50|72->50|80->58|80->58|82->60|90->68|90->68|90->68|91->69|91->69|91->69|92->70|92->70|92->70|99->77|99->77|99->77|100->78|100->78|100->78|101->79|101->79|101->79|102->80|102->80|102->80|103->81|103->81|103->81|104->82|104->82|104->82|105->83|105->83|105->83|106->84|106->84|106->84|107->85|107->85|107->85|108->86|108->86|108->86
                  -- GENERATED --
              */
          