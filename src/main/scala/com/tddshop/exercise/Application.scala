package com.tddshop.exercise

import com.tddshop.exercise.products.{Apple, Orange}
import com.tddshop.exercise.offers.{AppleOffer, OrangeOffer}
import com.tddshop.exercise.checkout.Checkout

/**
 * Main Application
 */
object Application extends App {
  println("Welcome to TDD Shop Checkout Scala Application!")

  val products = List(Apple, Orange, Apple, Apple, Apple, Orange, Orange)

  val withOutDiscount = new Checkout
  println(" output with-out discount for 4 apples (0.60p each) and 3 oranges (0.25 each) is: " + withOutDiscount.Total(products))

  val withDiscount = new Checkout(List(AppleOffer, OrangeOffer))
  println(" output with discount for 4 apples (Buy 1, Get 1 Free) and 3 oranges (Buy 2, and get 1 Free) is: " + withDiscount.Total(products))
}