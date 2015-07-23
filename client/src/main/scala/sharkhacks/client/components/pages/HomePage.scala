package sharkhacks.client.components.pages

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.ReactComponentB
import sharkhacks.client.MainRouter
import sharkhacks.client.components.scene.Scene

import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

object HomePage {
  //  val Styles = GlobalRegistry[PageStyles].get
  val component = ReactComponentB[MainRouter.Router]("ExamplePage")
    .render(router => {
    //    div(Styles.page,
    //      Scene(Scene.Props())
    //    )
    Scene(Scene.Props())
  }).build
}
