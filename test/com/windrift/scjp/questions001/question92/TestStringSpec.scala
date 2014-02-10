package com.windrift.scjp.questions001.question92

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class TestStringSpec extends BaseUnitSpec {
  "TestString test1 " should "return \"4247\"" in (
    assertResult("4247")(TestString.test1())
    )

  "StringBuilder.delete" should "not throw exception when the second param is grater than the string length" in (
    assert(TestString.deleteFromStringBuilder().length > 0)
    )

}
