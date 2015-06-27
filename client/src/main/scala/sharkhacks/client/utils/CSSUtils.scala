package sharkhacks.client.utils

import sharkhacks.Type
import Type._

/**
 * sharkhacks.client.utils
 */
object CSSUtils {
  /**
   * Returns the translate string.
   * @param p A point to 2D translate to.
   */
  def translate(p: PointDouble) = s"translate(${p.x}px, ${p.y}px)"
}
