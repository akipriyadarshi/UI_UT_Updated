package com.knoldus


  trait Operations {

    def divide(x:Int,y:Int):Int
    def fibonacci(x:Int):String
  }

  class DivAndFibo extends Operations {


    def divide(x: Int,y:Int): Int ={
      var result = x/y
      result

    }

      def fibonacci(no_of_terms: Int): String = {
      var (prevNum,nextNum,sum,i)=(0,1,0,2)
      var fibonacciSeriesStr= prevNum+" "+nextNum

      if(no_of_terms<=0)
        return "Invalid Input"
      else if(no_of_terms==1)
        return "0"
      else if(no_of_terms==2)
        return fibonacciSeriesStr

      while (i<no_of_terms) {
        sum = prevNum + nextNum
        fibonacciSeriesStr+=" "+sum
        prevNum = nextNum
        nextNum = sum
        i+=1
      }

      fibonacciSeriesStr
    }
  }


