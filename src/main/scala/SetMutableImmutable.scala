package org.javahorizon

object SetMutableImmutable {

  def main(args: Array[String]): Unit = {
    val indoorSports = Set("Carrom", "Ludo", "Swimming")
    println(s"Indoor Sports $indoorSports")

    var outdoorSports = scala.collection.mutable.Set("Cricket", "Football", "Tennis", "Football")
    outdoorSports += "Swimming"
    println(s"Outdoor Sports $outdoorSports")

    println(indoorSports ++ outdoorSports)
    println(indoorSports.&(outdoorSports))
    println(indoorSports.head)
    println(indoorSports.tail)


  }

}
