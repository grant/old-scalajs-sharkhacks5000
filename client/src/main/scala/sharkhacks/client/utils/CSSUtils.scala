package sharkhacks.client.utils

import sharkhacks.models.Point

/**
 * sharkhacks.client.utils
 */
object CSSUtils {
  /**
   * Returns the translate string.
   * @param p A point to 2D translate to.
   */
  def translate(p: Point) = s"translate(${p.x}px, ${p.y}px)"
}
