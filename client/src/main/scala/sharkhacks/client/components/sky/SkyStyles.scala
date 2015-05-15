package sharkhacks.client.components.sky

import scalacss.Defaults._

object SkyStyles extends StyleSheet.Inline {

  import dsl._

  val sky = style(
    addClassName("sky"),
    width(100 %%),
    height(100 %%),
    backgroundColor(blue)
  )
}