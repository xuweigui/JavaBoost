package com.windrift.scjp.questions001.question84

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class FooSpec extends BaseUnitSpec{
  "Foo" should "throw an ExceptionInInitializerError when initializing" in (
    intercept[ExceptionInInitializerError] {
      val foo : Foo = new Foo()
    }
  )

}
