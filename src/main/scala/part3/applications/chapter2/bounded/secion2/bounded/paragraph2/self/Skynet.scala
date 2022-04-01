package part3.applications.chapter2.bounded.secion2.bounded.paragraph2.self

case class Skynet(name: String, id: Int) extends User[Skynet] {
  override def rename(newName: String): Skynet = Skynet(newName, id)
}
