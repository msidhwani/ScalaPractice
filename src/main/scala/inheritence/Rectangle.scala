package org.javahorizon
package inheritence

class Rectangle(var width: Double, var length: Double) extends Shape {

  override def area = {
    width * length
  }

}
