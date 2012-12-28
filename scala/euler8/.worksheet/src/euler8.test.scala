package euler8
import euler8.Product._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
  lazy val l = "asdfasdfadfsadf123".toArray;System.out.println("""l  : Array[Char] = <lazy>""");$skip(25); val res$0 = 
  l reduceLeft {_ max _};System.out.println("""res0: Char = """ + $show(res$0));$skip(24); val res$1 = 
  maxProduct(bigNumber);System.out.println("""res1: Int = """ + $show(res$1));$skip(22); val res$2 = 
  List(1,2,3).product;System.out.println("""res2: Int = """ + $show(res$2))}
}