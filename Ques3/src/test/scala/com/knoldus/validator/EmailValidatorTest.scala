import com.knoldus.validator.EmailValidator

class EmailValidatorTest extends org.scalatest.AsyncFlatSpec {
  val email1=new EmailValidator
  val email2=new EmailValidator
  val email3=new EmailValidator

  "An email id" should "be in valid format" in {

    val res1 = email1.emailIdIsValid("Akash123321@gmail.com")
    assert(res1)
  }
  it should "not be valid if it contains more than one @ symnol" in {
    val res2= email1.emailIdIsValid("Akash@gmai@l.com")

    assert(!res2)

  }
  it should "also not be valid if it contains blank space" in {
    val res3= email1.emailIdIsValid("A kash@gmail.com")

    assert(!res3)
  }


}
