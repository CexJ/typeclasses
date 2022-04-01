package part3.applications.chapter2.bounded.secion1.naive

case class Skynet(name: String, id: Int) extends User {
  override def rename(newName: String): Person = Person(newName)
}
