package org.javahorizon

case class Customer(name:String, email: String)


object CaseClasses {

  def main(args: Array[String]): Unit = {

    val user1 = Customer("Customer", "xyz@abc.com")
    user1 match {
      case Customer(name,"xyz@abc.com")=> println("match")
      case _ => println("Not Match")
    }


  }



}
