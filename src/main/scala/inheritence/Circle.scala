package org.javahorizon
package inheritence

class Circle(var radius:Double) extends Shape {
  override def area: Double = {
    3.14 * radius * radius

  }



}
