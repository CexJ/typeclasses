package part2.implementation

trait JsonSerialiser[T] {

  def toJson(obj: T): String

}
