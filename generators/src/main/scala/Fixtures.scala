package example

import org.scalacheck.{ Arbitrary, Gen }

object Fixtures {
  import Arbitrary.arbitrary
  import Gen.{ alphaNumChar, listOf, listOfN, oneOf, choose }

  def alphaStr: Gen[String] =
    listOfN(10, alphaNumChar).map(_.mkString)
      .suchThat(_.forall(_.isLetter))
}
