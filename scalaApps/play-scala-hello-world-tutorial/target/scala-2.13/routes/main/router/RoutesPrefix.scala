// @GENERATOR:play-routes-compiler
// @SOURCE:/home/trevor/Desktop/docker/scalaApps/play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Mar 09 13:22:52 EAT 2020


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
