package org.javahorizon


class User(private var x: Int, val y: Int){

  def setX(x:Int): Unit ={
    this.x=x
  }

  def getX(): Int = {
    this.x
  }
}

object ScalaClasses {

  def main(args: Array[String]): Unit = {
    val user = new User(20, 30)
    println(user.getX())
    println(user.y)

  }

}
