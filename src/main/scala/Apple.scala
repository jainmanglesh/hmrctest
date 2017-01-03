package main.scala

/**
  * Created by Manglesh.Jain on 03/01/2017.
  */
case class Apple(
                  override val name: String = "Apple",
                  override val price: Double = .60,
                  override val pricedItem: Int = 2,
                  override val freeItem: Int = 1
                )
  extends Item
