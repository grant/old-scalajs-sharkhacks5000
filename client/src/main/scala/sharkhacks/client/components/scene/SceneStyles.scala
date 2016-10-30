package sharkhacks.client.components

import scalacss.Defaults._

object SceneStyles extends StyleSheet.Inline {

  import dsl._

  val scene = style(
    width(100 %%),
    height(100 %%)
  )
}