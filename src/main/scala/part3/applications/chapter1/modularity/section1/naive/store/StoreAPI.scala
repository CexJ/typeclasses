package part3.applications.chapter1.modularity.section1.naive.store

import scala.util.Random

object StoreAPI {

  def save(obj: JsonSerialisable): Int = {
    println(obj.toJson)
    Random.nextInt()
  }
}
