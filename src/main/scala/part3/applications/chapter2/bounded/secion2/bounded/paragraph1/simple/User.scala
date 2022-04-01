package part3.applications.chapter2.bounded.secion2.bounded.paragraph1.simple

trait User[T <: User[T]] {
  def name: String
  def rename(newName: String): T
}

case class Person(name: String) extends User[Person] {
  override def rename(newName: String): Person = Person(newName)
}

case class Bot(name: String, id: Int) extends User[Bot] {
  override def rename(newName: String): Bot = Bot(newName, id)
}



