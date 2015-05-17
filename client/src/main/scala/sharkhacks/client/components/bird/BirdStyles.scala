package sharkhacks.client.components.bird

import scalacss.Defaults._

object BirdStyles extends StyleSheet.Inline {

  import dsl._

  val bird = style(
    position.absolute,
    backgroundColor(blue),
    width(30 px),
    height(20 px)
  )
}
