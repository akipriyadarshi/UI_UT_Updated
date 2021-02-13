package com.knoldus



  import java.util.regex._

  class EmailValidator {
    val emailRegex: String = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    val pattern: Pattern =Pattern.compile(emailRegex)


    // this method will return true if given email is valid, otherwise false
    def isEmailValid(email: String): Boolean = {
      val matcher:Matcher = pattern.matcher(email)
      matcher.matches
    }


}
