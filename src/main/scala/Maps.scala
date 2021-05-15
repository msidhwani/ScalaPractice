package org.javahorizon

object Maps {

  def main(args: Array[String]): Unit = {
    val family: Map[Int, String] = Map(1 -> "Dad", 2 -> "Mom", 3 -> "Daughter", 3 -> "Son")
    println(family)
    println(family(3))
    println(family.keys)
    println(family.values)

    family.keys.foreach(
      x => println(family(x))
    )

    var _family: Map[Int, String] = Map(1 -> "Papa", 2 -> "Mummy")
    _family.+=(3 -> "Mohit")
    println(_family)



  }}
