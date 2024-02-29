package com.tddshop.exercise

import com.tddshop.exercise.offers.{AppleOffer, OrangeOffer}
import com.tddshop.exercise.products.{Apple, Orange}

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers

class OffersTest extends AnyFunSpec with Matchers {

  val input = List(Apple, Orange, Orange, Orange, Apple)


  it("AppleOffer should generate expected result" ){

    val expectedValue =  0.60

    val actualValue = AppleOffer.getDiscount(input)

    assert(expectedValue == actualValue)

  }

  it("OrangeOffer should generate expected result" ){

    val expectedValue =  0.50

    val actualValue = OrangeOffer.getDiscount(input)

    assert(expectedValue == actualValue)

  }
}
