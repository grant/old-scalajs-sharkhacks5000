package sharkhacks.client

import scalacss.Dsl._

object GlobalStyles {
  object Color {
    object Green {
      val Light = rgb(196, 233, 189)
      val Medium = rgb(162, 198, 150)
      val Dark = rgb(119, 141, 102)
    }

    object Red {
      val Light = rgb(193, 135, 139)
      val Medium = rgb(172, 81, 81)
      val Dark = rgb(142, 60, 59)
    }

    val White = rgb(253, 253, 253)
    object Gray {
      val Light = rgb(227, 219, 223)
      val Lighter = rgb(140, 148, 151)
      val Medium = rgb(131, 128, 135)
      val Darker = rgb(107, 105, 110)
      val Dark = rgb(54, 53, 58)
      val Darkest = rgb(34, 35, 36)
    }
    val Black = rgb(23, 23, 23)
  }

  object Fonts {
    object Title {
      val Family = "Courier New"
    }
  }
}
