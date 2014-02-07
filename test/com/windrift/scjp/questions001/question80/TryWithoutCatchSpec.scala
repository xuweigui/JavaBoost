package com.windrift.scjp.questions001.question80

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class TryWithoutCatchSpec extends BaseUnitSpec{
  it should "go to finally block when no catch block" in(
      TryWithoutCatch.test() should be ("finally")
    )
}
