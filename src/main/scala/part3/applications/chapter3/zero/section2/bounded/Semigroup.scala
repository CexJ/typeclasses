package part3.applications.chapter3.zero.section2.bounded

trait Semigroup[T <: Semigroup[T]] {
  def comp(a: T): T
}
