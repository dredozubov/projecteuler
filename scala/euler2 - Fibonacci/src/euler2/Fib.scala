package euler2

object Fib {
   def fib: Stream[Long] = {
    def loop(a: Int, b: Int): Stream[Long] = 
      a #:: loop(b, a+b)
     loop(0, 1)
   }
   
   def generate(n: Long): Long =
     fib takeWhile {_ < n} filter {_ % 2 == 0} sum
}