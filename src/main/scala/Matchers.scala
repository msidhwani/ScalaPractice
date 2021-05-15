package org.javahorizon

object Matchers {

  def main(args: Array[String]): Unit = {
    val age = 10
    age match {
      case 10 => println("minor")
      case 20 => println("adult")
      case _ => println("Invalid age")
    }


  }

}
