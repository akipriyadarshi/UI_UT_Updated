package com.knoldus



  class DivAndFiboTest extends org.scalatest.AsyncFlatSpec {
    val obj = new DivAndFibo

    "A division" should " have correct output" in {

      assert(obj.divide(18,2) == 9)

    }
    it should "throw ArithmeticException when divided by 0" in{

      assertThrows[ArithmeticException] {
        obj.divide(20,0)
      }
    }
    "A fibonacci series" should "have proper result" in{
      assert(obj.fibonacci(5).equals("0 1 1 2 3"))

    }
    it should "not accept negative or 0 values and print error message" in {
      assert(obj.fibonacci(0).equals("Invalid Input"))
    }



}
