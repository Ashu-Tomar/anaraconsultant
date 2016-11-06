
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
        """),format.raw/*13.9*/("""<meta name="google-site-verification" content="ZH2yvt6jWmNHrjSwkYac1IH3XVxXCaJ5SdGCdcsOq4Q"/>
        <title>AnaraConsultant</title>
        <link href=""""),_display_(/*15.22*/routes/*15.28*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*15.70*/("""" rel="stylesheet">
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*16.73*/("""" rel="stylesheet">
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("css/animate.min.css")),format.raw/*17.68*/("""" rel="stylesheet">
        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.versioned("css/prettyPhoto.css")),format.raw/*18.68*/("""" rel="stylesheet">
        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.versioned("css/main.css")),format.raw/*19.61*/("""" rel="stylesheet">
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("css/responsive.css")),format.raw/*20.67*/("""" rel="stylesheet">
        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("css/sweetalert.css")),format.raw/*21.67*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
        <link href=""""),_display_(/*23.22*/routes/*23.28*/.Assets.versioned("css/services.css")),format.raw/*23.65*/("""" rel="stylesheet">
        <link href=""""),_display_(/*24.22*/routes/*24.28*/.Assets.versioned("css/custom.css")),format.raw/*24.63*/("""" rel="stylesheet">
    </head>
    <body>
        """),format.raw/*28.32*/("""
    """),format.raw/*29.5*/("""<header id="header">
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src=""""),_display_(/*39.74*/routes/*39.80*/.Assets.versioned("images/anara-logo.png")),format.raw/*39.122*/("""" alt="logo" height="65px"></a>
                </div>

                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href=""""),_display_(/*44.54*/routes/*44.60*/.HomeController.index()),format.raw/*44.83*/("""">Home</a></li>
                        <li><a href=""""),_display_(/*45.39*/routes/*45.45*/.HomeController.about()),format.raw/*45.68*/("""">About Us</a></li>
                        <li><a href=""""),_display_(/*46.39*/routes/*46.45*/.HomeController.services()),format.raw/*46.71*/("""">Services</a></li>
                        <li><a href="services.html">Current oppurinities</a></li>
                        <li><a href=""""),_display_(/*48.39*/routes/*48.45*/.HomeController.contactus()),format.raw/*48.72*/("""">Contact Us</a></li>
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->

    </header><!--/header-->

        """),_display_(/*56.10*/content),format.raw/*56.17*/("""

        """),format.raw/*58.9*/("""<footer id="footer" class="midnight-blue">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                            &copy; copyright 2011 <a target="_blank" href="www.anaraconsultant.com" title="copyright">AnaraConsultant</a>. All Rights Reserved.
                    </div>
                    <div class="col-sm-6">
                        <ul class="pull-right">
                            <li><a href=""""),_display_(/*66.43*/routes/*66.49*/.HomeController.index()),format.raw/*66.72*/("""">Home</a></li>
                            <li><a href=""""),_display_(/*67.43*/routes/*67.49*/.HomeController.about()),format.raw/*67.72*/("""">About Us</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer><!--/#footer-->

        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.versioned("js/jquery.js")),format.raw/*75.62*/(""""></script>
        <script src=""""),_display_(/*76.23*/routes/*76.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*76.69*/(""""></script>
        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.versioned("js/jquery.prettyPhoto.js")),format.raw/*77.74*/(""""></script>
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.versioned("js/jquery.isotope.min.js")),format.raw/*78.74*/(""""></script>
        <script src=""""),_display_(/*79.23*/routes/*79.29*/.Assets.versioned("js/main.js")),format.raw/*79.60*/(""""></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("js/wow.min.js")),format.raw/*80.63*/(""""></script>
        <script src=""""),_display_(/*81.23*/routes/*81.29*/.Assets.versioned("js/jquery.blockUI.js")),format.raw/*81.70*/(""""></script>
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*82.70*/(""""></script>
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.versioned("js/custom.js")),format.raw/*83.62*/(""""></script>
        <script src=""""),_display_(/*84.23*/routes/*84.29*/.Assets.versioned("js/jquery.flip.js")),format.raw/*84.67*/(""""></script>

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
                  DATE: Tue Oct 25 15:26:38 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/main.scala.html
                  HASH: e7a58452e420d04b2862dd434085728439fa3043
                  MATRIX: 784->260|909->290|937->292|1017->397|1053->406|1234->560|1249->566|1312->608|1380->649|1395->655|1461->700|1529->741|1544->747|1605->787|1673->828|1688->834|1749->874|1817->915|1832->921|1886->954|1954->995|1969->1001|2029->1040|2097->1081|2112->1087|2172->1126|2277->1204|2292->1210|2353->1249|2404->1273|2419->1279|2477->1316|2545->1357|2560->1363|2616->1398|2695->1539|2727->1544|3371->2161|3386->2167|3450->2209|3702->2434|3717->2440|3761->2463|3842->2517|3857->2523|3901->2546|3986->2604|4001->2610|4048->2636|4215->2776|4230->2782|4278->2809|4478->2982|4506->2989|4543->2999|5046->3475|5061->3481|5105->3504|5190->3562|5205->3568|5249->3591|5515->3830|5530->3836|5584->3869|5645->3903|5660->3909|5721->3949|5782->3983|5797->3989|5863->4034|5924->4068|5939->4074|6005->4119|6066->4153|6081->4159|6133->4190|6194->4224|6209->4230|6264->4264|6325->4298|6340->4304|6402->4345|6463->4379|6478->4385|6540->4426|6601->4460|6616->4466|6670->4499|6731->4533|6746->4539|6805->4577
                  LINES: 25->7|30->7|32->9|35->12|36->13|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|50->28|51->29|61->39|61->39|61->39|66->44|66->44|66->44|67->45|67->45|67->45|68->46|68->46|68->46|70->48|70->48|70->48|78->56|78->56|80->58|88->66|88->66|88->66|89->67|89->67|89->67|97->75|97->75|97->75|98->76|98->76|98->76|99->77|99->77|99->77|100->78|100->78|100->78|101->79|101->79|101->79|102->80|102->80|102->80|103->81|103->81|103->81|104->82|104->82|104->82|105->83|105->83|105->83|106->84|106->84|106->84
                  -- GENERATED --
              */
          