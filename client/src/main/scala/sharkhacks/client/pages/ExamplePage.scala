package sharkhacks.client.pages

import japgolly.scalajs.react.ReactComponentB
import sharkhacks.client.MainRouter
import sharkhacks.client.components.ExampleComponent
import sharkhacks5000.models.SharedUserModel

object ExamplePage {
  val component = ReactComponentB[MainRouter.Router]("ExamplePage")
    .render(router => {
    val testUser = new SharedUserModel(name = "Grant Timmerman", username = "grant")
    ExampleComponent(ExampleComponent.Props(greeting = "Hello", user = testUser))
  }).build
}
