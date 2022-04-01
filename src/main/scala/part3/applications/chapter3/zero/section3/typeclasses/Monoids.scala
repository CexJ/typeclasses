package part3.applications.chapter3.zero.section3.typeclasses

object Monoids {

  implicit val vectMonoid = new Monoid[Vect] {
    override def unit: Vect = Vect(0.0, 0.0)

    override def comp(a: Vect, b: Vect): Vect = {
      (a,b) match {
        case (Vect((x1,y1),norm1), Vect((x2,y2),norm2)) =>
          val x = x1*norm1 + x2*norm2
          val y = y1*norm1 + y2*norm2
          Vect(x,y)
      }
    }
  }

}
