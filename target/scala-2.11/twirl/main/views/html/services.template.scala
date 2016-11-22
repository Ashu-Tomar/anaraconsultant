
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
        <div class="row contact-form  ">
            <div class="col-md-12 col-sm-12" style="margin-bottom: 30px; font-weight: bold; font-size: 16px;">
                <div class="bordered-form">
                    <h3> Send your details to book your ticket <br>
                        <span style="text-transform: none;font-weight: normal;font-size: 18px;position: relative;top: 10px;left: 0px;letter-spacing: 0px;color:#000;font-family: 'Josefin Sans', sans-serif;">
                            ( or send a mail to <a href="mailto:inf@anaraconsultant">
                            contact@anaraconsultant.com</a> with your details. )
                        </span>
                    </h3>
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
         </div>
    </div>
        """)))}),format.raw/*215.10*/("""
"""),format.raw/*216.1*/("""<script>
        var canvas = document.getElementById("myCanvas");
        var context = canvas.getContext('2d');
        var imageObj = new Image();

        imageObj.onload = function() """),format.raw/*221.38*/("""{"""),format.raw/*221.39*/("""
            """),format.raw/*222.13*/("""context.drawImage(imageObj, 30, 60);
        """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/(""";

        imageObj.src = """"),_display_(/*225.26*/routes/*225.32*/.Assets.versioned("images/services/procedure/img1.png")),format.raw/*225.87*/("""";
        $(document).ready(function()"""),format.raw/*226.37*/("""{"""),format.raw/*226.38*/("""

            """),format.raw/*228.13*/("""$('#change').click(function()"""),format.raw/*228.42*/("""{"""),format.raw/*228.43*/("""
                """),format.raw/*229.17*/("""var a = $('#takeinput').val();
                console.log("a:== " +a);
                $('p').text(a);
            """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/(""");
        """),format.raw/*233.9*/("""}"""),format.raw/*233.10*/(""");
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
                  DATE: Tue Nov 22 13:44:21 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/services.scala.html
                  HASH: 7fdfc3e1cb345aacdf47d109c71d1a3646a1bf91
                  MATRIX: 533->1|645->18|672->20|684->25|721->54|760->56|791->61|3007->2283|3052->2300|3325->2586|3370->2603|12793->11996|12822->11997|13039->12185|13069->12186|13111->12199|13184->12244|13214->12245|13270->12273|13286->12279|13363->12334|13431->12373|13461->12374|13504->12388|13562->12417|13592->12418|13638->12435|13783->12551|13813->12552|13852->12563|13882->12564
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|60->36|61->37|66->42|67->43|239->215|240->216|245->221|245->221|246->222|247->223|247->223|249->225|249->225|249->225|250->226|250->226|252->228|252->228|252->228|253->229|256->232|256->232|257->233|257->233
                  -- GENERATED --
              */
          