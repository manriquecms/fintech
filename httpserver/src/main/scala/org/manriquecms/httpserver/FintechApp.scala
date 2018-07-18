package org.manriquecms.httpserver

import akka.actor.ActorSystem
import akka.event.Logging
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.directives.DebuggingDirectives
import akka.stream.ActorMaterializer
import org.apache.logging.log4j.scala.Logging
import org.manriquecms.httpserver.model.Routes

import scala.concurrent.Future

object FintechApp  extends App with Logging {

  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher


  val clientRouteLogged = DebuggingDirectives.logRequestResult("Client ReST", Logging.InfoLevel)(Routes.allRoutes)

  val bindingFuture: Future[Http.ServerBinding] = Http().bindAndHandle(clientRouteLogged, interface = "0.0.0.0")

  bindingFuture.failed.foreach(ex => {
    logger error s"Failed to bind ${ex.getStackTrace}"
  })

  bindingFuture.onComplete(f => {
    logger info s"Server started to ${f.get.localAddress}"
  })


}
