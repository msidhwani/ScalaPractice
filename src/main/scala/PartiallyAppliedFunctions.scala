package org.javahorizon

import java.util.Date

object PartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    def sum(x:Int,y:Int,z:Int)={
      x+y+z
    }

    val _sum = sum(10, 20, _ : Int)
    val _logger = log(new Date(),_:String)

    println(_sum(30))
    _logger("Hello World")
    _logger("Hello Universe")



  }

  def log(date: Date, message: String): Unit ={
    println(s"$date $message")
  }

}
