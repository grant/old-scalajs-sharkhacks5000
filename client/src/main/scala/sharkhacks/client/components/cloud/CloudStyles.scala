package sharkhacks.client.components.cloud


import sharkhacks.client.GlobalStyles.Colors

import scalacss.Defaults._

object CloudStyles extends StyleSheet.Inline {

  import dsl._

  val cloud = style(
    position.absolute,
    width(300 px),
    height(200 px),
//    transform := "translate(20px, 30px)",
    backgroundColor(Colors.White)
  )
}
