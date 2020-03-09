// @GENERATOR:play-routes-compiler
// @SOURCE:/home/trevor/Desktop/docker/scalaApp/play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Mar 09 12:30:27 EAT 2020


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
