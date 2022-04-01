package part3.applications.chapter3.zero.section2.bounded

case class Vect(direction: (Double, Double), norm: Double) extends Semigroup[Vect] {
  override def comp(v: Vect): Vect = {
    val x =  direction._1 * norm + v.direction._1 * v.norm
    val y =  direction._2 * norm + v.direction._2 * v.norm
    Vect(x, y)
  }
}

object Vect {
  def apply(x: Double, y: Double): Vect = {
    val norm = Math.sqrt(x*x + y*y)
    new Vect((x/norm, y/norm), norm)
  }

  val ZERO = Vect(0.0,0.0)
}
