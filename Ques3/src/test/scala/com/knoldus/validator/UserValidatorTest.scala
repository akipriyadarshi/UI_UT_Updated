
import com.knoldus.models.{Company, User}
import com.knoldus.request.{CompanyImpl, UserImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}


class UserValidatorTest extends org.scalatest.AsyncFlatSpec {
  val user1= User("Abhishek",22,"Knoldus","Abhi407@gmail.com")
  val user2= User("Akash",22,"Philips","Abhi407@g@mail.com")
  val emailValidator = new EmailValidator
  val UValidator = new UserValidator(emailValidator)
  val userimpl = new UserImpl(UValidator)

  "A user company's name" should " exist in database" in {
    val res = UValidator.userIsValid(user1)
    assert(res)
  }
  "A user" should "have a valid email id" in{
    val res = UValidator.userIsValid(user2)
    assert(!res)
  }


}

