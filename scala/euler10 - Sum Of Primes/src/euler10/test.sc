package euler10
import euler10.SumOfPrimes._
import scala.math.sqrt

object test {
  (0 to 20).toStream.filterNot(_ == 10).take(20).toList
                                                  //> res0: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16,
                                                  //|  17, 18, 19, 20)
  lazy val m = maxPrimeDiv(600851475143L)         //> m  : Array[Long] = <lazy>
  m.length                                        //> res1: Int = 4
  m(m.length-1)                                   //> res2: Long = 6857
  BigInt(1231241241) + BigInt(1231241242)         //> res3: scala.math.BigInt = 2462482483
  1231241241+1231241242                           //> res4: Int(-1832484813) = -1832484813
  Array(1,2,3).contains(2)                        //> res5: Boolean = true
  //sumOfPrimes(2000000)
  
  (0 until 1000).toList.filter(x => ((x % 3 == 0) || (x % 5 ==0))).sum
                                                  //> res6: Int = 233168
}