package part3.applications.chapter3.zero.section1.naive

class VectApp {

  val movements = List(
    Vect(1.0,2.0),
    Vect(3.0,-1.0),
    Vect(-0.5,-1.0),
    Vect(1.0,0.75)
  )

  val finalPosition = Composer.compose(movements)(Vect.ZERO) { case (Vect((x1,y1), norm1), Vect((x2,y2), norm2)) =>
    val x = x1*norm1 + x2*norm2
    val y = y1*norm1 + y2*norm2

    Vect(x, y)
  }
}
