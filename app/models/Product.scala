package models

// Entity object
case class Product(ean: Long, name: String, description: String)

// companion object serves as a DAO object
object Product {
  var products = Set(
	Product(5010255079763L, "Micro SMG", "Magazine size 16 rounds(30 with extended)"),
	Product(5018206244666L, "Pistol.50", "Magazie size 9 rounds. Simple."),
	Product(5018306332812L, "Assault SMG", "Magazine size 30 rounds"),
	Product(5018306312913L, "Norinco Type 56-2", "Rate of fire 360 RPM"),
	Product(5018206244611L, "Tavor TAR-21", "Rate of fire 500 RPM")
  )
  
  def findAll = products.toList.sortBy(_.ean)
  
  def findByEan(ean: Long) = products.find(_.ean == ean)
  
  def add(product: Product) {
    products = products + product
  }
}