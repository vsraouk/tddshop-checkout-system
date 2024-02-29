package com.tddshop.exercise
package com.tddshop.exercise.offers

import com.tddshop.exercise.products.Product
sealed trait Offers {

  def getDiscount(products : List[Product]): Double
}

object AppleOffer extends Offers {
  override def getDiscount(cart : List[Product]): Double = {
    0.0
  }

}

object OrangeOffer extends Offers {
  override def getDiscount(cart : List[Product]): Double ={
    0.0
  }

}
