
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pagenotfound_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class pagenotfound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Welcome to Play")/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
"""),format.raw/*3.1*/("""<section id="error" class="container text-center">
  <h1>404, Page not found</h1>
  <p>The Page you are looking for doesn't exist or an other error occurred.</p>
  <a class="btn btn-primary" href=""""),_display_(/*6.37*/routes/*6.43*/.HomeController.about()),format.raw/*6.66*/("""">GO BACK TO THE HOMEPAGE</a>
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
object pagenotfound extends pagenotfound_Scope0.pagenotfound
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 13:54:18 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/pagenotfound.scala.html
                  HASH: 440f768eeb9ed6833ba19f911b31c33fe82a19a2
                  MATRIX: 541->1|653->18|680->20|692->25|729->54|768->56|795->57|1019->255|1033->261|1076->284
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|30->6|30->6|30->6
                  -- GENERATED --
              */
          