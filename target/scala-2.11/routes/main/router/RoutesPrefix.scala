
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ashu/Documents/projects/anaraconsultant/conf/routes
// @DATE:Thu Sep 29 18:13:46 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
