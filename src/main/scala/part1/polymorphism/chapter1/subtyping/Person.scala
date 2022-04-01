package part1.polymorphism.chapter1.subtyping

import part3.applications.chapter1.modularity.section1.naive.store.JsonSerialisable

class Person(name: String) extends JsonSerialisable {
  override def toJson: String =
    s"""
       |{
       |  "name": "$name"
       |}
       |""".stripMargin
}
