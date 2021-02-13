package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, EmployeeReadDto, UserReadDto}
import com.knoldus.models.{Company, Employee, User}

class UserValidator (validateEmail: EmailValidator){
  def userIsValid(user: User): Boolean = {
    val obj = new UserReadDto
    val x:Option[User] =obj.getUserCompanyByName(user.companyName)
    if((!(x.isEmpty))&&(validateEmail.emailIdIsValid(user.emailId)))
      true
    else
      false
  }

}
