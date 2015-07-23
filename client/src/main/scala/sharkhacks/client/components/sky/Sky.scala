package sharkhacks.client.components.sky

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import sharkhacks.client.Region
import sharkhacks.client.components.bird.Bird
import sharkhacks.client.components.cloud.Cloud
import sharkhacks.client.components.outerspace.SunMoon
import sharkhacks.models.GameTime
import sharkhacks.models.geometry.{Point, Rectangle}

import scalacss.ScalaCssReact._

object Sky {
  case class Props(val region: Rectangle, var gameTime: GameTime) extends Region

  case class State()

  class Backend(t: BackendScope[Props, State]) {

  }

  val SkyComponent = ReactComponentB[Props]("SkyComponent")
    .initialState(State())
    .backend(new Backend(_))
    .render((props, state, backend) => {

    val styles: Array[TagMod] = props.getStyles ++ Array[TagMod](SkyStyles.sky)

    div(styles,
      // children
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

