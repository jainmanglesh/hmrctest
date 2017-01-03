package test.scala

import org.scalatest.FlatSpec
import main.scala.ShoppingCart
import main.scala.Item

/**
  * Created by Manglesh.Jain on 03/01/2017.
  */
class ShoppingCartTest extends FlatSpec {

  "item" should "be added to the cart" in {
    val cart = new ShoppingCart
    val items = List("Apple")
    for (fruit <- items) {
      cart.addItems(Item(fruit))
    }
    assert(cart.itemList.size.equals(1))
  }

  "cart" should "give total cost with no offer" in {
    var cart = new ShoppingCart
    val fruitBasket = List("Orange", "Apple", "Apple", "Apple")
    for (fruit <- fruitBasket) {
      cart.addItems(Item(fruit))
    }
    assert(cart.calculateCostWithNoOffer === 2.05)
  }

  "cart" should "give total cost with offer" in {
    var cart = new ShoppingCart
    val fruitBasket = List("Orange", "Apple", "Orange", "Orange", "Apple")
    for (fruit <- fruitBasket) {
      cart.addItems(Item(fruit))
    }
    assert(cart.calculateCostWithOffer === 1.10)
  }

  "cart" should "give total cost with odd items including offer" in {
    var cart = new ShoppingCart
    val fruitBasket = List("Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange")
    for (fruit <- fruitBasket) {
      cart.addItems(Item(fruit))
    }
    assert(cart.calculateCostWithOffer === 2.20)
  }


}

