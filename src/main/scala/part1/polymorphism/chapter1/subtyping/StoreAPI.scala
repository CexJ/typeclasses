package part1.polymorphism.chapter1.subtyping

import scala.util.Random

object StoreAPI {

  def save(obj: JsonSerialisable): Int = {
    println(obj.toJson)
    Random.nextInt()
  }
}
