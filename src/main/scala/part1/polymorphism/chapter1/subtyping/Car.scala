package part1.polymorphism.chapter1.subtyping

import part3.applications.chapter1.modularity.section1.naive.store.JsonSerialisable

class Car(model: String, price: Double) extends JsonSerialisable {
  override def toJson: String =
    s"""
       |{
       |  "model": "$model",
       |  "price": $price
       |}
       |""".stripMargin
}
