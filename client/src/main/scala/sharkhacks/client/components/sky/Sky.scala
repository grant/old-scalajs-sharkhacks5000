package sharkhacks.client.components.sky

import sharkhacks.client.components.bird.Bird
import sharkhacks.client.components.outerspace.SunMoon
import sharkhacks.models.{GameTime, Point}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.components.cloud.Cloud

import scalacss.ScalaCssReact._

object Sky {

  case class Props(var gameTime: GameTime)

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SkyComponent = ReactComponentB[Props]("SkyComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {

    println(props.gameTime.time)

    div(SkyStyles.sky,
      SunMoon(SunMoon.Props()),
      ul(className := "clouds"
        , Cloud(Cloud.Props(new Point(props.gameTime.time, 4)))
      ),
      ul(className := "birds",
        Bird(Bird.Props())
      )
    )
  })
    .build

  def apply(props: Props) = SkyComponent(props)
}

