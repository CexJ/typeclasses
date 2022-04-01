package part3.applications.chapter3.zero.section1.naive

class VectApp {

  val movements = List(
    Vect(1.0,2.0),
    Vect(3.0,-1.0),
    Vect(-0.5,-1.0),
    Vect(1.0,0.75)
  )

  val finalPosition = Composer.compose(movements)(Vect.ZERO)
}
