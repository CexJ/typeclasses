package part3.applications.chapter3.zero.section1.naive

object Composer {

  def compose[T](list: List[T])(zero: T)(comp: (T, T) => T): T =
    list.fold(zero)(comp)
}
