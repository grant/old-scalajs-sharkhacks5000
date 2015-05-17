package sharkhacks.client.components.boat

import sharkhacks.client.GlobalStyles.Color

import scalacss.Defaults._

object BoatStyles extends StyleSheet.Inline {

  import dsl._

  val boat = style(
    position.absolute,
    width(300 px),
    height(200 px),
    left(30 %%),
    marginTop(-120 px),
    backgroundColor(Color.Gray.Dark)
  )

}
