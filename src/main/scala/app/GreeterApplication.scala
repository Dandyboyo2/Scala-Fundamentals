package app

import scala.io.StdIn

object GreeterApplication extends App {

  val input = StdIn.readLine("Hello, what is your name?\n")

  val person = new Person(input)

  println(person.speak())


}
