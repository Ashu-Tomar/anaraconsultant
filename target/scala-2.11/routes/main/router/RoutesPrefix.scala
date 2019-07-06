
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ashu/Documents/anaraconsultant/conf/routes
// @DATE:Wed Dec 07 12:08:58 IST 2016


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
