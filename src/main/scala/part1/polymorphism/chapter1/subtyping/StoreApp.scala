package part1.polymorphism.chapter1.subtyping

import part3.applications.chapter1.modularity.section1.naive.entities.{Car, Person}
import part3.applications.chapter1.modularity.section1.naive.store.StoreAPI

object StoreApp extends App {

  val aliceCar = new Car("Prius", 19999.99)
  StoreAPI.save(aliceCar)

  val bob = new Person("Bob")
  StoreAPI.save(bob)

}
