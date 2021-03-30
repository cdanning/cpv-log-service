package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import java.time.LocalDateTime

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class LogController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  private val events = Logger("events")
  
  def logEvent(user: String, event: String, data: String) = Action { implicit request: Request[AnyContent] =>
    val ts = LocalDateTime.now
    events.info(s"[$ts] $user - $event - $data")
    Created(ts.toString)
  }
}
