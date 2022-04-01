package part3.applications.chapter3.zero.section3.typeclasses

case class Vect(direction: (Double, Double), norm: Double)

object Vect {
  def apply(x: Double, y: Double): Vect = {
    val norm = Math.sqrt(x*x + y*y)
    new Vect((x/norm, y/norm), norm)
  }
}
