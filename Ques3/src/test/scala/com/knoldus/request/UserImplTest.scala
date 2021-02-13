
import com.knoldus.models.{Company, User}
import com.knoldus.request.{CompanyImpl, UserImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}

class UserImplTest extends org.scalatest.AsyncFlatSpec {
  val user1= User("Akash",22,"knoldus","Aki407@gmail.com")
  val user2= User("Vikash",22,"knoldus","vik 407@gmail.com")
  val mockedUValidator = mock[UserValidator]
  val userimpl = new UserImpl(mockedUValidator)
  "A user " should " exist in database" in {

    when(mockedUValidator.userIsValid(user1)) thenReturn true



    val res = userimpl.createUser(user1)
    assert(!(res.isEmpty))
  }
  it should "have a valid email id" in{
    when(mockedUValidator.userIsValid(user2)) thenReturn false



    val res = userimpl.createUser(user2)
    assert((res.isEmpty))
  }
}

