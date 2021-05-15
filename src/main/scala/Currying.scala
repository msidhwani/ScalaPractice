package org.javahorizon

object Currying {

  def add(x:Int) = {
    (y:Int) => x+y
  }


  def main(args: Array[String]): Unit = {
    val sum = add(20)
    println(sum(10))
    println(add(20)(10))
  }

}
