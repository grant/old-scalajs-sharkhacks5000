package sharkhacks.client

import scalacss.Defaults._
import scalacss.ValueT.Color
import scalacss._
import Dsl.{unsafeRoot => $, _}

object GlobalStyles {
  object Colors {
    object Green {
      val Light = Color.rgb(196, 233, 189)
      val Medium = Color.rgb(162, 198, 150)
      val Dark = Color.rgb(119, 141, 102)
    }

    object Red {
      val Light = Color.rgb(193, 135, 139)
      val Medium = Color.rgb(172, 81, 81)
      val Dark = Color.rgb(142, 60, 59)
    }

    val White = Color.rgb(253, 253, 253)
    object Gray {
      val Light = Color.rgb(227, 219, 223)
      val Lighter = Color.rgb(140, 148, 151)
      val Medium = Color.rgb(131, 128, 135)
      val Darker = Color.rgb(107, 105, 110)
      val Dark = Color.rgb(54, 53, 58)
      val Darkest = Color.rgb(34, 35, 36)
    }
    val Black = Color.rgb(23, 23, 23)
  }
}
