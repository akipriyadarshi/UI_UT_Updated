

  import com.knoldus.models.Company
  import com.knoldus.request.CompanyImpl
  import com.knoldus.validator.{CompanyValidator, EmailValidator}
  import org.mockito.MockitoSugar.{mock, when}

  class CompanyValidatorTest extends org.scalatest.AsyncFlatSpec {
    val emailValidator = new EmailValidator
    val CValidator = new CompanyValidator(emailValidator)


    val compimpl = new CompanyImpl(CValidator)
    val company1= Company("HP","HP123@gmail.com","Delhi")
    val company2= Company("Apple","Apple 123@gmail.com","Noida")

    "A company " should " not already exist in database" in {


      val result = CValidator.companyIsValid(company1)
      assert(result)
    }
    it should "have a valid email id" in{
      val result = CValidator.companyIsValid(company2)
      assert(!result)

    }





}
