package part3.applications.chapter1.modularity.section3.typeclasses.service

import part3.applications.chapter1.modularity.section3.typeclasses.entities.{Car, Person}
import part3.applications.chapter1.modularity.section3.typeclasses.store.StoreAPI


object StoreApp extends App{

  import JsonSerialisers._

  val aliceCar = Car("Prius", 19999.99)
  StoreAPI.save(aliceCar)

  val bob = Person("Bob")
  StoreAPI.save(bob)

}
