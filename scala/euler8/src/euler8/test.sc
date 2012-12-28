package euler8
import euler8.Product._

object test {
  lazy val l = "asdfasdfadfsadf123".toArray       //> l  : Array[Char] = <lazy>
  l reduceLeft {_ max _}                          //> res0: Char = s
  maxProduct(bigNumber)                           //> res1: Int = 40824
  List(1,2,3).product                             //> res2: Int = 6
}