package part3.applications.chapter1.modularity.section2.gof.service

import part3.applications.chapter1.modularity.section2.gof.entities.Person
import part3.applications.chapter1.modularity.section2.gof.store.JsonSerialisable

class PersonWrapper(person: Person) extends JsonSerialisable {
  override def toJson: String =
    s"""
       |{
       |  "name": "${person.name}"
       |}
       |""".stripMargin
}
