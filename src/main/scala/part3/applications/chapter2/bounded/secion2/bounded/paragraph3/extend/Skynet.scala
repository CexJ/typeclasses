package part3.applications.chapter2.bounded.secion2.bounded.paragraph3.extend


case class Skynet(override val name: String, override val id: Int) extends Bot(name, id) {
  override def rename(newName: String): Bot = new Bot(newName, id)
}
