package part2.implementation

import scala.util.Random

object StoreAPI {

  def save[T](obj: T)(implicit serialiser: JsonSerialiser[T]): Int = {
    println(serialiser.toJson(obj))
    Random.nextInt()
  }
}
