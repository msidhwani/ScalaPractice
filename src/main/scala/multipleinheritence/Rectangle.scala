package org.javahorizon.multipleinheritence

class Rectangle(var width: Double, var length: Double) extends Shapes {

  def area = {
    width * length
  }

}
