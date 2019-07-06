
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ashu/Documents/anaraconsultant/conf/routes
// @DATE:Wed Dec 07 12:08:58 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:14
  CountController_3: controllers.CountController,
  // @LINE:16
  AsyncController_2: controllers.AsyncController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:14
    CountController_3: controllers.CountController,
    // @LINE:16
    AsyncController_2: controllers.AsyncController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactus""", """controllers.HomeController.contactus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services""", """controllers.HomeController.services"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagenotfound""", """controllers.HomeController.pagenotfound"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.HomeController.submitData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactform""", """controllers.HomeController.contactsubmitData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_contactus2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactus")))
  )
  private[this] lazy val controllers_HomeController_contactus2_invoker = createInvoker(
    HomeController_0.contactus,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactus",
      Nil,
      "GET",
      """""",
      this.prefix + """contactus"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_services3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services")))
  )
  private[this] lazy val controllers_HomeController_services3_invoker = createInvoker(
    HomeController_0.services,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "services",
      Nil,
      "GET",
      """""",
      this.prefix + """services"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_pagenotfound4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagenotfound")))
  )
  private[this] lazy val controllers_HomeController_pagenotfound4_invoker = createInvoker(
    HomeController_0.pagenotfound,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "pagenotfound",
      Nil,
      "GET",
      """""",
      this.prefix + """pagenotfound"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_submitData5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_HomeController_submitData5_invoker = createInvoker(
    HomeController_0.submitData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitData",
      Nil,
      "POST",
      """""",
      this.prefix + """widgets"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_contactsubmitData6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactform")))
  )
  private[this] lazy val controllers_HomeController_contactsubmitData6_invoker = createInvoker(
    HomeController_0.contactsubmitData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactsubmitData",
      Nil,
      "POST",
      """""",
      this.prefix + """contactform"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CountController_count7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count7_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AsyncController_message8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message8_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:8
    case controllers_HomeController_contactus2_route(params) =>
      call { 
        controllers_HomeController_contactus2_invoker.call(HomeController_0.contactus)
      }
  
    // @LINE:9
    case controllers_HomeController_services3_route(params) =>
      call { 
        controllers_HomeController_services3_invoker.call(HomeController_0.services)
      }
  
    // @LINE:10
    case controllers_HomeController_pagenotfound4_route(params) =>
      call { 
        controllers_HomeController_pagenotfound4_invoker.call(HomeController_0.pagenotfound)
      }
  
    // @LINE:11
    case controllers_HomeController_submitData5_route(params) =>
      call { 
        controllers_HomeController_submitData5_invoker.call(HomeController_0.submitData)
      }
  
    // @LINE:12
    case controllers_HomeController_contactsubmitData6_route(params) =>
      call { 
        controllers_HomeController_contactsubmitData6_invoker.call(HomeController_0.contactsubmitData)
      }
  
    // @LINE:14
    case controllers_CountController_count7_route(params) =>
      call { 
        controllers_CountController_count7_invoker.call(CountController_3.count)
      }
  
    // @LINE:16
    case controllers_AsyncController_message8_route(params) =>
      call { 
        controllers_AsyncController_message8_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:19
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
