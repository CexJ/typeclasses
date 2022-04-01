package part3.applications.chapter3.zero.section2.bounded

object Composer {

  def compose[T <: Semigroup[T]](list: List[T])(zero: T): T =
    list.fold(zero) {
      case (a,b) => a.comp(b)
    }
}
