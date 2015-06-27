package sharkhacks.models.geometry


import sharkhacks.Type.PointDouble

/**
 * A rectangle.
 * @param _center The center point.
 * @param _width The width of the rectangle.
 * @param _height The height of the rectangle.
 */
// TODO Don't compute the left, top, bottom, right every time we call a method. Memoize.
class Rectangle(
                 private val _center: PointDouble,
                 private val _width: Double,
                 private val _height: Double) {
  def center = _center

  def width = _width

  def height = _height

  def left = _center.x - (width / 2)

  def top = _center.y - (height / 2)

  def bottom = _center.y + (height / 2)

  def right = _center.x + (width / 2)

  def topleft = new PointDouble(_x = left, _y = top)

  def bottomRight = new PointDouble(_x = right, _y = bottom)

  def contains(p: PointDouble): Boolean = p.x >= left && p.x <= right && p.y >= top && p.y <= bottom

  def intersects(r: Rectangle) =
    left <= r.right &&
      r.left <= right &&
      top <= r.bottom &&
      r.top <= bottom

}
