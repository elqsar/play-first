package test

import org.specs2.mutable._
import play.api.test._
import play.api.test.Helpers._
import play.api.{ Application, GlobalSettings }
import play.api.db.DB
import org.squeryl.adapters.H2Adapter
import org.squeryl.{ Session, SessionFactory }
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import play.api.test.FakeApplication
import org.squeryl.PrimitiveTypeMode.inTransaction
import models.Product

class ModelSpec extends FlatSpec with ShouldMatchers {

  "A Product" should "be creatable" in {
    running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {
      inTransaction {
        val p = Product.productTable insert(Product(1L, 5010255079763L, "Micro SMG", "Magazine size 16 rounds(30 with extended)"))
        p.id should not equal(0)
      }
    }
  }

}