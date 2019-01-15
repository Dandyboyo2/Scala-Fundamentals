package app

class Person(val name : String) {

  def speak() : String = {
    
      if (name == "adam") {
        "You don't get a hello!"
      }
      else {
        s"Hello $name"
      }
  }
}
