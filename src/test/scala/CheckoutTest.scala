package com.tddshop.exercise

import com.tddshop.exercise.products.{Apple, Orange}
import com.tddshop.exercise.offers.{AppleOffer, OrangeOffer}
import com.tddshop.exercise.checkout.Checkout
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers
class CheckoutTest extends AnyFunSpec with Matchers {

  val input = List(Apple, Orange, Apple, Orange, Orange, Orange, Apple)

  def ~=(x: Double, y: Double) = {
    if ((x - y).abs < 0.0001) true else false
  }

  it("Checkout with no offers should generate expected result" ){

    val checkout = new Checkout

    val expectedValue =  2.80
    val actualValue = checkout.Total(input)

    assert(~=(expectedValue,  actualValue))

  }

  it("Checkout with AppleOffer should generate expected result" ){

    val checkout = new Checkout(List(AppleOffer))

    val expectedValue =  2.20
    val actualValue = checkout.Total(input)

    assert(~=(expectedValue,  actualValue))

  }

  it("Checkout with OrangeOffer should generate expected result" ){

    val checkout = new Checkout(List(OrangeOffer))

    val expectedValue =  2.55
    val actualValue = checkout.Total(input)

    assert(~=(expectedValue,  actualValue))

  }

  it("Checkout with AppleOffer and OrangeOffer should generate expected result" ){

    val checkout = new Checkout(List(AppleOffer, OrangeOffer))

    val expectedValue =  1.95
    val actualValue = checkout.Total(input)

    assert(~=(expectedValue,  actualValue))

  }

}
