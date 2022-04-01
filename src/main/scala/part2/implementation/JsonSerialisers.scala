package part2.implementation

import part3.applications.chapter1.modularity.section3.typeclasses.entities.{Car, Person}
import part3.applications.chapter1.modularity.section3.typeclasses.store.JsonSerialiser

object JsonSerialisers {

  implicit val personJsonSerialiser = new JsonSerialiser[Person] {
    override def toJson(person: Person): String =
      s"""
         |{
         |  "name": "${person.name}"
         |}
         |""".stripMargin
  }

  implicit val carJsonSerialiser = new JsonSerialiser[Car] {
    override def toJson(car: Car): String =
      s"""
         |{
         |  "model": "${car.model}",
         |  "price": ${car.price}
         |}
         |""".stripMargin
  }
}
