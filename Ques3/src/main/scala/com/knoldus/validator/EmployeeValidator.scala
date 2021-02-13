package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, EmployeeReadDto}
import com.knoldus.models.{Company, Employee}

class EmployeeValidator {


  def employeeIsValid(employee: Employee): Boolean = {
    val obj = new EmployeeReadDto
    val x:Option[Employee] =obj.getEmployeeByName(employee.companyName)
    if(x.isEmpty)
      true
    else
      false
  }
}
