package com.knoldus.db

import com.knoldus.models.{Company, Employee}

import scala.collection.immutable.HashMap

class EmployeeReadDto {


    val knoldusEmployee: Employee = Employee("Akash", "Priyadarshi", 22,30000,"Intern","Knoldus","aki407@gmail.com")
    val philipsEmployee: Employee = Employee("Amrit", "Verma", 23,30000,"Developer","Philips","amrit123@gmail.com")
    val employees: HashMap[String, Employee] = HashMap("Akash" -> knoldusEmployee, "Amrit" -> philipsEmployee)

    def getEmployeeByName(name: String): Option[Employee] = employees.get(name)



}
