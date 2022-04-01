package part3.applications.chapter2.bounded.secion2.bounded.paragraph1.simple

case class Skynet(name: String, id: Int) extends User[Person] {
  override def rename(newName: String): Person = Person(newName)
}
