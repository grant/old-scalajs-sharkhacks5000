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
                 private var _center: PointDouble,
                 private var _width: Double,
                 private var _height: Double) {
  def this(top: Double, right: Double, bottom: Double, left: Double) {
    this(new PointDouble((left + right) / 2, (top + bottom) / 2), right - left, bottom - top);
    assert(right > left)
    assert(top < bottom)
  }

  def center = _center

  def center_=(c: PointDouble): Unit = _center = c

  def width = _width

  def width_=(w: Double): Unit = _width = w

  def height = _height

  def height_=(h: Double): Unit = _height = h

  def left = _center.x - (width / 2)

  def top = _center.y - (height / 2)

  def bottom = _center.y + (height / 2)

  def right = _center.x + (width / 2)

  def topLeft = new PointDouble(_x = left, _y = top)

  def bottomRight = new PointDouble(_x = right, _y = bottom)

  def contains(p: PointDouble): Boolean = p.x >= left && p.x <= right && p.y >= top && p.y <= bottom

  def intersects(r: Rectangle) =
    left <= r.right &&
      r.left <= right &&
      top <= r.bottom &&
      r.top <= bottom

}
