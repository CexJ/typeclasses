package part3.applications.chapter1.modularity.section3.typeclasses.store

import scala.util.Random

object StoreAPI {

  def save[T](obj: T)(implicit serialiser: JsonSerialiser[T]): Int = {
    println(serialiser.toJson(obj))
    Random.nextInt()
  }
}
