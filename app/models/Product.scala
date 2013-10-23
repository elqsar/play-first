package models

import org.squeryl.KeyedEntity
import org.squeryl.Schema
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Query

// Entity object
case class Product(id: Long, ean: Long, name: String, description: String) extends KeyedEntity[Long]

// companion object serves as a DAO object
object Product extends Schema {

  val productTable = table[Product]("products")

  on(productTable)(p => declare {
    p.id is (autoIncremented)
  })

  def allProducts = from(productTable)(product => select(product).orderBy(product.ean.desc))
  def findAll: List[Product] = inTransaction(allProducts.toList)

  def add(product: Product): Product = inTransaction(productTable.insert(product))

  def findByEan(ean: Long): Product = inTransaction(productTable.where(product => product.ean === ean).single)
}