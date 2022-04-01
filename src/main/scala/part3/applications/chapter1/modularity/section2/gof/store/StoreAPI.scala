package part3.applications.chapter1.modularity.section2.gof.store

import scala.util.Random

object StoreAPI {

  def save(obj: JsonSerialisable): Int = {
    println(obj.toJson)
    Random.nextInt()
  }
}
