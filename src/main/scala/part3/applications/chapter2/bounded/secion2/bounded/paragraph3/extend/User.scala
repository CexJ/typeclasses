package part3.applications.chapter2.bounded.secion2.bounded.paragraph3.extend

trait User[T <: User[T]] { this: T =>
  def name: String
  def rename(newName: String): T
}

case class Person(name: String) extends User[Person] {
  override def rename(newName: String): Person = Person(newName)
}

class Bot(val name: String, val id: Int) extends User[Bot] {
  override def rename(newName: String): Bot = new Bot(newName, id)
}


