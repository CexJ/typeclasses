package part3.applications.chapter3.zero.section3.typeclasses

trait Monoid[T] {
  def unit: T
  def comp(a: T, b: T): T
}
