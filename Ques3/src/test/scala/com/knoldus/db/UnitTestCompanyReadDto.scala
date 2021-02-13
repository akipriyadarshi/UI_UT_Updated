import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company


class UnitTestCompanyReadDto extends org.scalatest.AsyncFlatSpec {
  val comp1= Company("Knoldus","knoldus321@gmail.com","Noida")
   val obj1=new CompanyReadDto
  val res1=obj1.getCompanyByName(comp1.name)
  "Company Database" should "return available name" in {
    assert(!(res1.isEmpty))
  }
  val comp2= Company("Google","google321@gmail.com","Noida")
  val obj2=new CompanyReadDto
  val res2=obj2.getCompanyByName(comp2.name)
  it should "return none if name is not present" in {
    assert(res2.isEmpty)
  }

}
