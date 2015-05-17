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

  object wings extends StyleSheet.Inline {
    val left = style(
      addClassName("left-wing"),
      backgroundColor(blue)
    )

    val right = style(
      addClassName("right-wing"),
      backgroundColor(red)
    )
  }

  def getStyles(): Array[StyleSheet.Inline] = {
    Array(
      this,
      wings
    )
  }
}
