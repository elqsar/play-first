package models

// Entity object
case class Product(ean: Long, name: String, description: String)

// companion object serves as a DAO object
object Product {
  var products = Set(
	Product(5010255079763L, "Paperclips Large", "Large plain pack of 1000"),
	Product(5018206244666L, "Giant Paperclips", "Giant Plai 51 mm 100 pack"),
	Product(5018306332812L, "Paperclip Giant Plain", "Giant Plain Pack of 10000"),
	Product(5018306312913L, "No Tear Paper Clip", "No Tear Extra Large Pack of 1000"),
	Product(5018206244611L, "Zebra Paperclips", "Zebra Length 28mm Assorted 150 pack")
  )
  
  def findAll = products.toList.sortBy(_.ean)
  
  def findByEan(ean: Long) = products.find(_.ean == ean)
  
  def add(product: Product) {
    products = products + product
  }
}