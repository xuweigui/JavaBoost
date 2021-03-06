package com.windrift.java.general.questions001.question80

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class TryWithoutCatchSpec extends BaseUnitSpec{
  "TryWithoutCatch" should "compile and go to finally block when exception thrown" in(
      TryWithoutCatch.test() should be ("finally")
    )

  "something" should "throws NPE" in (
    intercept[NullPointerException] {
      var s : String = null
      s.toString()
    }
  )
}
