package part3.applications.chapter2.bounded.secion1.naive

trait User {
  def name: String
  def rename(newName: String): User
}

case class Person(name: String) extends User {
  override def rename(newName: String): Person = Person(newName)
}

case class Bot(name: String, id: Int) extends User {
  override def rename(newName: String): Bot = Bot(newName, id)
}


