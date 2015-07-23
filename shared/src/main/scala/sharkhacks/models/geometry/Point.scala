package sharkhacks.models.geometry

/**
 * A 2D point of floating numbers.
 */
class Point[T](private val _x: T = 0, private val _y: T = 0) {
  def x: T = _x
  def y: T = _y
}
