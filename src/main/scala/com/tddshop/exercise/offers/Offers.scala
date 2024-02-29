package com.tddshop.exercise
package com.tddshop.exercise.offers

import com.tddshop.exercise.products.{Apple, Product, Orange}
sealed trait Offers {

  def getDiscount(products : List[Product]): Double
}

object AppleOffer extends Offers {
  override def getDiscount(cart : List[Product]): Double = {
    cart.filter(_ == Apple).size / 2 * Apple.price
  }

}

object OrangeOffer extends Offers {
  override def getDiscount(cart : List[Product]): Double ={
    cart.filter(_ == Orange).size / 3 * Orange.price * 2
  }

}
