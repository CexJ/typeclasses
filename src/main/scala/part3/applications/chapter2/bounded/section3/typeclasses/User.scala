package part3.applications.chapter2.bounded.section3.typeclasses

trait User
case class Person(name: String) extends User
class Bot(val name: String, val id: Int) extends User
case class Skynet(override val name: String, override val id: Int) extends Bot(name, id)



