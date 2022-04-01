package part3.applications.chapter3.zero.section3.typeclasses

object Composer {

  def compose[T](list: List[T])(implicit monoid: Monoid[T]): T =
    list.fold(monoid.unit)(monoid.comp)
}
