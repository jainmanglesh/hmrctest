package main.scala
import scala.collection.mutable.ArrayBuffer

/**
  * Created by Manglesh.Jain on 03/01/2017.
  */
class ShoppingCart {

  val itemList = new ArrayBuffer[Item]
  var totalPrice: Double = 0

  def addItems(item: Item) = {
    itemList += item
  }

  def calculateCostWithNoOffer(): Double = {
    itemList.map(x => x.price).sum
  }

  def calculateCostWithOffer(): Double = {
    val groupItemsByName = itemList.groupBy(identity).map(x => (x._1, x._2.size))
    groupItemsByName.foreach(
      x => {
        totalPrice += ((x._2 / x._1.pricedItem * x._1.freeItem) + x._2 % x._1.pricedItem) * x._1.price
      })
    totalPrice
  }
}