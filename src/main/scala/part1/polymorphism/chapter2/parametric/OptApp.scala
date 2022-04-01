package part1.polymorphism.chapter2.parametric

import part1.polymorphism.chapter2.parametric.Opt.{Nope, Yup}

object OptApp extends App {

  val y = Yup("something")
  val n = Nope

  def extract[T](o: Opt[T]): T = o match {
    case Yup(something) => something
    case Nope => throw new Exception
  }

  extract(y)
  extract(n)
}
