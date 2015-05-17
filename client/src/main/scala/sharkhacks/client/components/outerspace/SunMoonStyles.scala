package sharkhacks.client.components.outerspace

import sharkhacks.client.GlobalStyles.Color

import scalacss.Defaults._

object SunMoonStyles extends StyleSheet.Inline {

  import dsl._

  val size = 400

  val sunmoon = style(
    position.absolute,
    width(size px),
    height(size px),
    bottom(0 px),
    left(50 %%),
    marginLeft(-(size / 2) px),
    backgroundColor(Color.Gray.Light)
  )
}