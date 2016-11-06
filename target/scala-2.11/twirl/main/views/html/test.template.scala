
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.24*/("""

"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""



  """)))}))
      }
    }
  }

  def render(userForm:Form[UserData]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[UserData]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Mon Sep 26 16:42:06 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/test.scala.html
                  HASH: cf505719ea025d76277103ab72b15bd077dec6e1
                  MATRIX: 533->1|654->27|682->51|710->54|741->77|780->79
                  LINES: 20->1|25->1|26->2|28->4|28->4|28->4
                  -- GENERATED --
              */
          