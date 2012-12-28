package euler2

import euler2.Fib._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); val res$0 = 
  //fib takeWhile {_ < 4000000L} sum
  generate(4000000L);System.out.println("""res0: Long = """ + $show(res$0))}
 
}