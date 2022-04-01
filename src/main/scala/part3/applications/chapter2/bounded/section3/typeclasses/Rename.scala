package part3.applications.chapter2.bounded.section3.typeclasses

trait Rename[T] {
  def rename(t: T)(newName: String): T
}

object Rename {

  implicit val renamePerson = new Rename[Person] {
    override def rename(person: Person)(newName: String): Person = Person(newName)
  }

  implicit val renameBot = new Rename[Bot] {
    override def rename(bot: Bot)(newName: String): Bot = new Bot(newName, bot.id)
  }

  implicit val renameSkynet = new Rename[Skynet] {
    override def rename(skynet: Skynet)(newName: String): Skynet = Skynet(newName, skynet.id)
  }

}
