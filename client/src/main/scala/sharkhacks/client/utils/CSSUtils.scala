package sharkhacks.client.utils

import sharkhacks.Type
import Type._

/**
 * sharkhacks.client.utils
 */
object CSSUtils {
  private def roundAt(p: Int)(n: Double): Double = {
    val s = math pow (10, p)
    (math round n * s) / s
  }

  private val round: (Double) => Double = roundAt(5)

  def px(top: Double) = round(top) + "px"

  /**
   * Returns the translate string.
   * @param p A point to 2D translate to.
   */
  def translate(p: PointDouble) = s"translate(${p.x}px, ${p.y}px)"
}
