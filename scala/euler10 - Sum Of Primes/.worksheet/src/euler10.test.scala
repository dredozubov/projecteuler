package euler10
import euler10.SumOfPrimes._
import scala.math.sqrt

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(138); val res$0 = 
  (0 to 20).toStream.filterNot(_ == 10).take(20).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(42); 
  lazy val m = maxPrimeDiv(600851475143L);System.out.println("""m  : Array[Long] = <lazy>""");$skip(11); val res$1 = 
  m.length;System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
  m(m.length-1);System.out.println("""res2: Long = """ + $show(res$2));$skip(42); val res$3 = 
  BigInt(1231241241) + BigInt(1231241242);System.out.println("""res3: scala.math.BigInt = """ + $show(res$3));$skip(24); val res$4 = 
  1231241241+1231241242;System.out.println("""res4: Int(-1832484813) = """ + $show(res$4));$skip(27); val res$5 = 
  Array(1,2,3).contains(2);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(99); val res$6 = 
  //sumOfPrimes(2000000)
  
  (0 until 1000).toList.filter(x => ((x % 3 == 0) || (x % 5 ==0))).sum;System.out.println("""res6: Int = """ + $show(res$6))}
}