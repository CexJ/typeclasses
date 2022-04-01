package part3.applications.chapter3.zero.section3.typeclasses

class VectApp extends App{

  val movements = List(
    Vect(1.0,2.0),
    Vect(3.0,-1.0),
    Vect(-0.5,-1.0),
    Vect(1.0,0.75)
  )

  import Monoids._
  val finalPosition = Composer.compose(movements)
}
