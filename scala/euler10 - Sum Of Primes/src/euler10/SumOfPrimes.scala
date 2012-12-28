package euler10

import scala.math.sqrt

object SumOfPrimes {
   
    def sumOfPrimes(limit: Int): Long = {
      val enum: Array[Int] = (2 to limit).toArray
      var bs: Array[Boolean] = Array.fill(enum.length)(true)
      for {
        i <- 2 to sqrt(limit).toInt
        if (bs(i-2) == true)
        j <- i *i to limit
        if ((j - i*i) % i == 0)
      } {
        bs(j-2) = false
      }

      bs.zip(enum).filter(_._1).map(_._2.toLong).sum
    }
    
  
   def maxPrimeDiv(limit: Long): Array[Long] = {
    val enum: Array[Long] = (2L to sqrt(limit).toLong).toArray
      var bs: Array[Boolean] = Array.fill(enum.length)(true)
      for {
        i <- 2L to sqrt(limit).toLong
        if (bs((i-2).toInt) == true)
        j <- i * i to sqrt(limit).toLong
        if ((j - i*i) % i == 0)
      } {
        bs((j-2).toInt) = false
      }

      bs.zip(enum).filter(_._1).map(_._2.toLong).filter(limit % _ == 0)
    }
    
}