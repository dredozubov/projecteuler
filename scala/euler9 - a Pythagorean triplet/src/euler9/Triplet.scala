package euler9

object Triplet {
   def isTriplet(a: Int, b: Int, c: Int) = a*a + b*b == c*c
   
   def generate(sum: Int): Int = 
     (for {
       a <- 1 to 500
       b <- a to 500
       c <- b to 500
       if (a + b + c == sum) && (isTriplet(a,b,c))
     } yield List(a,b,c)).toList.flatten.product
     
}