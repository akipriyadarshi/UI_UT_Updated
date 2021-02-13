
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}

class CompanyImplTest extends org.scalatest.AsyncFlatSpec {
   val comp1= Company("Knoldus","Knoldus321@gmail.com","Noida")
  val comp2= Company("Google","Google321@gmail.com","Bangalore")
  val comp3= Company("Apple","Apple 321@gmail.com","Bangalore")
  val mockedCValidator = mock[CompanyValidator]
  val compimpl = new CompanyImpl(mockedCValidator)
   "A company " should " not already exist in database" in {

     when(mockedCValidator.companyIsValid(comp1)) thenReturn false



     val res = compimpl.createCompany(comp1)
     assert((res.isEmpty))
   }
  it should "get created if not in database" in {
    when(mockedCValidator.companyIsValid(comp2)) thenReturn true
    val res = compimpl.createCompany(comp2)
    assert(!(res.isEmpty))


  }
  it should "have a valid email id" in{
    when(mockedCValidator.companyIsValid(comp3)) thenReturn false
    val res = compimpl.createCompany(comp3)
    assert((res.isEmpty))
  }




}
