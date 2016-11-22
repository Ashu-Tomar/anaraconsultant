
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Welcome to Play")/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="page-header page-header-with-icon" style="border-top:none ; border-bottom: 2px solid #eaedf2 ;
                padding-bottom: 20px ;
                padding-top: 10px ;
                margin: 30px 0 0px 0 ;
                ">
                    <i class="fa fa-suitcase" style="top:70px"></i>
                    <h2 style="text-transform: uppercase ;
                    font-weight: 500 ;
                    margin: 18px 10px ;
                    font-size: 26px ;
                    ">
                        Our Services
                    </h2>
                </div>
            </div>
            <div class="col-md-12 col-sm-12 service_block text-center">
                <div class="content-box">
                    <h3>
                        <i class="fa fa-comments process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
                    </h3>
                    <h4 class="h4-body-title process-flow-heading">1. Overseas Recruitment</h4>

                    <p class="process-flow-paragraph">
                        We, Anara Consultant, have expertise in offering services for Overseas Recruitment. As job seekers, you can rely upon us for overseas placements in various sectors. We have set up a wide network spread overseas in order to serve you in getting jobs in your area of interest. With the support of our experienced professionals, we help you in getting placed as a HR. manager, Civil Engineer, Bio-medical technician, supervisor, division head, production manager, marketing executive, accountant, computer operator, content writer/editor and many more depending upon your educational qualification, skills and area of interest. 
                        Also we organize walk in interview for getting hired directly by client and explore about the company by company professional itself. We find suitable place and companies for you and find suitable candidates for the company as well.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                """),format.raw/*36.51*/("""
                """),format.raw/*37.17*/("""<h2 class="process-flow-heading" style="font-family: 'Quicksand',sans-serif ;
                text-transform: capitalize ;
                font-size: 22px ; text-align: center
                ">
                    Procedure
                    """),format.raw/*42.62*/("""
                """),format.raw/*43.17*/("""</h2>

            </div>
            <div class="col-md-12">
                <div class="col-sm-3 panel-item">
                    <a class="panel panel-circle-big-contrast" href="#">
                        <div class="panel-icon">
                            <p>1</p>
                        </div>
                        <div class="panel-body">
                            <h3 class="panel-title">Identification</h3>
                        </div>
                    </a>
                </div>
                <div class="col-sm-3 panel-item">
                    <a class="panel panel-circle-big-contrast" href="#">
                        <div class="panel-icon screening">
                            <p>2</p>
                        </div>
                        <div class="panel-body">
                            <h3 class="panel-title">Screening</h3>
                        </div>
                    </a>
                </div>
                <div class="col-sm-3 panel-item">
                    <a class="panel panel-circle-big-contrast" href="#">
                        <div class="panel-icon interview">
                            <p>3</p>
                        </div>
                        <div class="panel-body">
                            <h3 class="panel-title">Interview</h3>
                        </div>
                    </a>
                </div>
                <div class="col-sm-3 panel-item">
                    <a class="panel panel-circle-big-contrast" href="#">
                        <div class="panel-icon filtering">
                            <p>4</p>
                        </div>
                        <div class="panel-body">
                            <h3 class="panel-title">Filtering</h3>
                        </div>
                    </a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 col-sm-12 service_block text-center">
                <div class="content-box">
                    <h3>
                        <i class="fa fa-comments process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
                    </h3>
                    <h4 class="h4-body-title process-flow-heading">2. Document Attestation</h4>

                    <p class="process-flow-paragraph">
                        One of the things which can make or break your chances of getting that dream
                        job is proper documentation, especially for an overseas location.
                        It is important to be aware of the rules of MEA (Ministry of Foreign Affairs)
                        and arrange accordingly. If you do not follow the MEA guidelines,
                        the process becomes null and void. We help our clients complete this process,
                        without any hassles or misinterpretations.</p>
                </div>
            </div>
            <div class="col-md-12 col-sm-12 service_block">
                <div class="content-box-text justify paragraph_google_font">
                    Following documents (foreign countries) require attestations:
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Educational Certificates: Degree & Mark sheet of concerned exams.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp; Affidavits.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Transfer Certificate.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Marriage Certificate.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Birth Certificate.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Power of Attorney.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Legalization Certificate.
                </div>
            </div>
            <div class="col-md-12 col-sm-12 service_block">
                <div class="content-box-text justify paragraph_google_font">
                    All Attestations are authenticated from:
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Delhi Embassy.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp; HRD (Ministry of Human Resource Development).
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;MEA (Ministry of External Affairs).
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;State Home Department.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Birth Certificate.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;From all concerned Embassies.
                </div>
                <div class="content-box-text justify paragraph_google_font" style="font-weight: normal">
                    <i class="fa fa-thumbs-up"></i>&nbsp;Legalization Certificate.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 col-sm-12 service_block text-center">
                <div class="content-box">
                    <h3>
                        <i class="fa fa-comments process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
                    </h3>
                    <h4 class="h4-body-title process-flow-heading">3. Domestic and International Air Ticket</h4>

                    <p class="process-flow-paragraph">
                        We offer you the best price for making your journey affordable so that you can enjoy your travel and holiday.</p>
                </div>
            </div>
        </div>
        """)))}),format.raw/*172.10*/("""
"""),format.raw/*173.1*/("""<script>
        var canvas = document.getElementById("myCanvas");
        var context = canvas.getContext('2d');
        var imageObj = new Image();

        imageObj.onload = function() """),format.raw/*178.38*/("""{"""),format.raw/*178.39*/("""
            """),format.raw/*179.13*/("""context.drawImage(imageObj, 30, 60);
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/(""";

        imageObj.src = """"),_display_(/*182.26*/routes/*182.32*/.Assets.versioned("images/services/procedure/img1.png")),format.raw/*182.87*/("""";
        $(document).ready(function()"""),format.raw/*183.37*/("""{"""),format.raw/*183.38*/("""

            """),format.raw/*185.13*/("""$('#change').click(function()"""),format.raw/*185.42*/("""{"""),format.raw/*185.43*/("""
                """),format.raw/*186.17*/("""var a = $('#takeinput').val();
                console.log("a:== " +a);
                $('p').text(a);
            """),format.raw/*189.13*/("""}"""),format.raw/*189.14*/(""");
        """),format.raw/*190.9*/("""}"""),format.raw/*190.10*/(""");
</script>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Tue Nov 22 12:45:47 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/services.scala.html
                  HASH: 67dc286b3b6305125c79889d7fdc7a79f3b22cde
                  MATRIX: 533->1|645->18|672->20|684->25|721->54|760->56|791->61|3010->2286|3055->2303|3328->2589|3373->2606|10498->9699|10527->9700|10744->9888|10774->9889|10816->9902|10889->9947|10919->9948|10975->9976|10991->9982|11068->10037|11136->10076|11166->10077|11209->10091|11267->10120|11297->10121|11343->10138|11488->10254|11518->10255|11557->10266|11587->10267
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|60->36|61->37|66->42|67->43|196->172|197->173|202->178|202->178|203->179|204->180|204->180|206->182|206->182|206->182|207->183|207->183|209->185|209->185|209->185|210->186|213->189|213->189|214->190|214->190
                  -- GENERATED --
              */
          