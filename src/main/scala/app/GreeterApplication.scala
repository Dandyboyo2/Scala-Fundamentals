package app

//import scala.io.StdIn

object GreeterApplication extends App {

  val name = Prompt.ask("Hello, what is your name?\n")

  val person = new Person(name)

  println(person.speak())

}
