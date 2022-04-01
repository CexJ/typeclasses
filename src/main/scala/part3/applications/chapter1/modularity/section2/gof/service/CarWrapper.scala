package part3.applications.chapter1.modularity.section2.gof.service

import part3.applications.chapter1.modularity.section2.gof.entities.Car
import part3.applications.chapter1.modularity.section2.gof.store.JsonSerialisable

class CarWrapper(car: Car) extends JsonSerialisable {
  override def toJson: String =
    s"""
       |{
       |  "model": "${car.model}",
       |  "model": ${car.price}
       |}
       |""".stripMargin
}
