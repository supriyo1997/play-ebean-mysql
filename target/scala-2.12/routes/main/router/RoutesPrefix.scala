// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/EBEAN/play-ebean/conf/routes
// @DATE:Sat Dec 09 23:00:57 IST 2023


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
