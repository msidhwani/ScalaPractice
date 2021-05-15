package org.javahorizon


case class Test(v:Int)

object Test {

  def main(args: Array[String]): Unit = {
    val test =new Test(10)
    println(test.v)
    println(test.toString)
  }

}
