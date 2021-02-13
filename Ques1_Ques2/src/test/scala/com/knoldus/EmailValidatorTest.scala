package com.knoldus

class EmailValidatorTest extends org.scalatest.AsyncFlatSpec {
    val obj = new EmailValidator
  "An email" should "have no blank spaces" in {
    assert(obj.isEmailValid("aki404@gmail.com"))
  }
  it should "not be valid as it contains two or more dot symbols" in{


    assert(!(obj.isEmailValid("aki407@gmail..com")))
  }



}
