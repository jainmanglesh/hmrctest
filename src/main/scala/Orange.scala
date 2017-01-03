package main.scala

/**
  * Created by Manglesh.Jain on 03/01/2017.
  */
case class Orange(
                   override val name: String = "Orange",
                   override val price: Double = .25,
                   override val pricedItem: Int = 3,
                   override val freeItem: Int = 2
                 )
  extends Item
