package sharkhacks.client.components

import scalacss.Defaults._

object OverlayStyles extends StyleSheet.Inline {

  import dsl._

  val overlay = style(
    width(100 %%),
    height(100 %%)
  )
}