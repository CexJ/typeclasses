package part3.applications.chapter1.modularity.section2.gof.service

import part3.applications.chapter1.modularity.section2.gof.entities.{Car, Person}
import part3.applications.chapter1.modularity.section2.gof.store.StoreAPI

object StoreApp extends App {

  val aliceCar = Car("Prius", 19999.99)
  val aliceCarW = new CarWrapper(aliceCar)
  StoreAPI.save(aliceCarW)

  val bob = Person("Bob")
  val bobW = new PersonWrapper(bob)
  StoreAPI.save(bobW)

}
