package experiments
import org.uacalc.alg.conlat.BasicPartition
import collection.JavaConversions._
import collection.mutable._

object BlockSums {
  println("Welcome to the Scala worksheet")
  val a = new BasicPartition("|0,1,2|3,4,5|")
  val b1 = new BasicPartition("|0,3|1,4|2,5|")
  val b2 = new BasicPartition("|0,4|1,5|2,3|")
  val b3 = new BasicPartition("|0,5|1,3|2,4|")
}