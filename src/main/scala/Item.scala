package main.scala

/**
  * Created by Manglesh.Jain on 03/01/2017.
  */
trait Item {
  val name = ""
  val price: Double = 0
  val pricedItem = 0
  val freeItem = 0
}

object Item {
  def apply(s: String): Item = {
    if (s == "Orange") return new Orange
    else return new Apple
  }
}
