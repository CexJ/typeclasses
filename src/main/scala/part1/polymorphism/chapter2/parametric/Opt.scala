package part1.polymorphism.chapter2.parametric

sealed trait Opt[T]

object Opt {

  case object Nope extends Opt[Nothing]

  case class Yup[T](t: T) extends Opt[T]

}
