package com.tddshop.exercise
package com.tddshop.exercise.checkout
import com.tddshop.exercise.products.Product
import com.tddshop.exercise.offers.Offers

class Checkout(offers: List[Offers] = Nil) {
  def Total(inputProducts: List[Product]): Double = {
    var result = 0.0

    for (product <- inputProducts) {
      result += product.price
    }

    for (offer <- offers) {
      result = result - offer.getDiscount(inputProducts)
    }

   result
  }

}

