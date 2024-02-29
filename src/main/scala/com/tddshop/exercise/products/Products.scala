package com.tddshop.exercise
package com.tddshop.exercise.products

sealed trait Product {
  def price: Double
}

final object Apple extends Product {
  val price = 0.6
}

final object Orange extends Product {
  val price = 0.25
}
