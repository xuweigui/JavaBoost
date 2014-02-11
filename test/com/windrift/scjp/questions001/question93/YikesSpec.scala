package com.windrift.scjp.questions001.question93

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class YikesSpec extends BaseUnitSpec {
  "Yikes.go" should "return long with Long param" in (
    Yikes.go(java.lang.Long.valueOf(12)) should be("Long")
    )

  val s: Short = 12
  it should "return int with Short param" in (
    Yikes.go(s) should be("int")
    )
}
