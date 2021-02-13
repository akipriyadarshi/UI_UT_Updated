package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, UserReadDto}
import com.knoldus.models.Company

class CompanyValidator(validateEmail: EmailValidator){

  def companyIsValid(company: Company): Boolean = {
    val obj = new CompanyReadDto
    val x:Option[Company] =obj.getCompanyByName(company.name)
    if(x.isEmpty&& validateEmail.emailIdIsValid(company.emailId))
       true
    else
       false





  }

}
