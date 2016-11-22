
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
                        <i class="fa fa-users process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
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
                        <i class="fa fa-gavel process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
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
                        <i class="fa fa-plane process-icon" style="padding:15px 17px ; font-size: 35px ;"></i>
                    </h3>
                    <h4 class="h4-body-title process-flow-heading">3. Domestic and International Air Ticket</h4>

                    <p class="process-flow-paragraph">
                        We offer you the best price for making your journey affordable so that you can enjoy your travel and holiday.</p>
                </div>
            </div>
        </div>
    </div>
        """)))}),format.raw/*173.10*/("""
"""),format.raw/*174.1*/("""<script>
        var canvas = document.getElementById("myCanvas");
        var context = canvas.getContext('2d');
        var imageObj = new Image();

        imageObj.onload = function() """),format.raw/*179.38*/("""{"""),format.raw/*179.39*/("""
            """),format.raw/*180.13*/("""context.drawImage(imageObj, 30, 60);
        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/(""";

        imageObj.src = """"),_display_(/*183.26*/routes/*183.32*/.Assets.versioned("images/services/procedure/img1.png")),format.raw/*183.87*/("""";
        $(document).ready(function()"""),format.raw/*184.37*/("""{"""),format.raw/*184.38*/("""

            """),format.raw/*186.13*/("""$('#change').click(function()"""),format.raw/*186.42*/("""{"""),format.raw/*186.43*/("""
                """),format.raw/*187.17*/("""var a = $('#takeinput').val();
                console.log("a:== " +a);
                $('p').text(a);
            """),format.raw/*190.13*/("""}"""),format.raw/*190.14*/(""");
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""");
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
                  DATE: Tue Nov 22 13:16:40 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/services.scala.html
                  HASH: c61f8e75f8d08ff1880f1e84e969ce642f39d002
                  MATRIX: 533->1|645->18|672->20|684->25|721->54|760->56|791->61|3007->2283|3052->2300|3325->2586|3370->2603|10500->9701|10529->9702|10746->9890|10776->9891|10818->9904|10891->9949|10921->9950|10977->9978|10993->9984|11070->10039|11138->10078|11168->10079|11211->10093|11269->10122|11299->10123|11345->10140|11490->10256|11520->10257|11559->10268|11589->10269
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|60->36|61->37|66->42|67->43|197->173|198->174|203->179|203->179|204->180|205->181|205->181|207->183|207->183|207->183|208->184|208->184|210->186|210->186|210->186|211->187|214->190|214->190|215->191|215->191
                  -- GENERATED --
              */
          