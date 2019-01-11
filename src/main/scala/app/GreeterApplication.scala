package app

import scala.io.StdIn

object GreeterApplication extends App {

  def greet(name: String): Unit = println(s"Hello $name")

  val name = StdIn.readLine("Hello, what is your name?\n")

  greet(name)
}





