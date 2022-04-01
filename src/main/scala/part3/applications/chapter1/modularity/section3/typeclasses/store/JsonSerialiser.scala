package part3.applications.chapter1.modularity.section3.typeclasses.store

trait JsonSerialiser[T] {

  def toJson(obj: T): String

}
