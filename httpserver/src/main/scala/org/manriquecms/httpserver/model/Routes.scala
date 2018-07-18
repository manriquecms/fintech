package org.manriquecms.httpserver.model

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object Routes {
  def defaultRoutes: Route =
    get {
      pathSingleSlash {
        complete {
          "Welcome to Fintech"
        }
      } ~
        path("ping") {
          complete("PONG!")
        }
    }

  def finRoutes: Route =
    get {
      path ("banks") {
        complete {
          "Here in banks"
        }
      }
    }

  def allRoutes = defaultRoutes ~ finRoutes
}
