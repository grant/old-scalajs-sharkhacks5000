package sharkhacks.client.components.scene

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra._
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.raw.HTMLElement
import sharkhacks.client.components.ocean.Ocean
import sharkhacks.client.components.seabed.Seabed
import sharkhacks.client.components.sky.Sky
import sharkhacks.models.GameTime

import scala.concurrent.duration._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}


object Scene {

  case class Props()

  case class State(val gameTime: GameTime)

  class Backend(t: BackendScope[Props, State]) extends OnUnmount {

    def tick(): Unit = {
      //      println("test")
      //      g.window.requestAnimationFrame(tick)
      t.setState(t.state.copy(gameTime = t.state.gameTime.tick()))
    }

    def componentDidMount() = {
      //      g.window.requestAnimationFrame
      tick()

      val i = js.timers.setInterval(16.millisecond)(tick())
      onUnmount(js.timers.clearInterval(i))
    }
  }

  val SceneComponent = ReactComponentB[Props]("SceneComponent")
    .initialStateP(props => {
      State(gameTime = new GameTime())
    })
    .backend(new Backend(_))
    .render((props, state, backend) => {
    div(className := "Scene",
      Sky(Sky.Props(gameTime = state.gameTime)),
      Ocean(Ocean.Props()),
      Seabed(Seabed.Props())
    )
  })
    .componentDidMount(_.backend.componentDidMount())
    .build

  def apply(props: Props) = SceneComponent(props)
}

