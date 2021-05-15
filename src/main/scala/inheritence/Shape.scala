  package org.javahorizon
package inheritence

abstract class Shape {
  def area: Double
}

object Shape {

  def main(args: Array[String]): Unit = {
    printArea(new Rectangle(10, 20))
    printArea(new Circle(10))
  }

  def printArea(shape: Shape) = {
    println(shape.area)
  }
}
