package sharkhacks.client

import japgolly.scalajs.react.extra.router._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.pages.{HomePage, NotFoundPage}

object MainRouter extends RoutingRules {
  // Register the routes
  val root = register(rootLocation(HomePage.component))
  override val notFound = render(NotFoundPage.component)

  /**
   * Creates the basic page structure under the body tag.
   */
  override protected def interceptRender(ic: InterceptionR) = {
    div(className := "page")(ic.element)
  }
}
