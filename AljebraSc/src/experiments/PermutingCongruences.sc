package experiments
import org.uacalc.alg.conlat.BasicPartition
import collection.JavaConversions._
import collection.mutable._

object PermutingCongruences {
  val a = new BasicPartition("|0,1,2|3,4,5|")     //> a  : org.uacalc.alg.conlat.BasicPartition = |0,1,2|3,4,5|
  val b1 = new BasicPartition("|0,3|1,4|2,5|")    //> b1  : org.uacalc.alg.conlat.BasicPartition = |0,3|1,4|2,5|
  val b2 = new BasicPartition("|0,4|1,5|2,3|")    //> b2  : org.uacalc.alg.conlat.BasicPartition = |0,4|1,5|2,3|
  val b3 = new BasicPartition("|0,5|1,3|2,4|")    //> b3  : org.uacalc.alg.conlat.BasicPartition = |0,5|1,3|2,4|
  val c1 = a.compose(b1)                          //> blocks: [[0,1,2],[3,4,5]]
                                                  //| c1  : org.uacalc.alg.conlat.BinaryRelation = [[0, 0], [0, 1], [0, 2], [0, 3]
                                                  //| , [0, 4], [0, 5], [1, 0], [1, 1], [1, 2], [1, 3], [1, 4], [1, 5], [2, 0], [2
                                                  //| , 1], [2, 2], [2, 3], [2, 4], [2, 5], [3, 0], [3, 1], [3, 2], [3, 3], [3, 4]
                                                  //| , [3, 5], [4, 0], [4, 1], [4, 2], [4, 3], [4, 4], [4, 5], [5, 0], [5, 1], [5
                                                  //| , 2], [5, 3], [5, 4], [5, 5]]
  val c2 = a.compose(b2)                          //> c2  : org.uacalc.alg.conlat.BinaryRelation = [[0, 0], [0, 1], [0, 2], [0, 3]
                                                  //| , [0, 4], [0, 5], [1, 0], [1, 1], [1, 2], [1, 3], [1, 4], [1, 5], [2, 0], [2
                                                  //| , 1], [2, 2], [2, 3], [2, 4], [2, 5], [3, 0], [3, 1], [3, 2], [3, 3], [3, 4]
                                                  //| , [3, 5], [4, 0], [4, 1], [4, 2], [4, 3], [4, 4], [4, 5], [5, 0], [5, 1], [5
                                                  //| , 2], [5, 3], [5, 4], [5, 5]]
	val c3 = b1.compose(b2)                   //> blocks: [[0,3],[1,4],[2,5]]
                                                  //| c3  : org.uacalc.alg.conlat.BinaryRelation = [[0, 0], [0, 2], [0, 3], [0, 4]
                                                  //| , [1, 0], [1, 1], [1, 4], [1, 5], [2, 1], [2, 2], [2, 3], [2, 5], [3, 0], [3
                                                  //| , 2], [3, 3], [3, 4], [4, 0], [4, 1], [4, 4], [4, 5], [5, 1], [5, 2], [5, 3]
                                                  //| , [5, 5]]
	val c4 = b2.compose(b1)                   //> blocks: [[0,4],[1,5],[2,3]]
                                                  //| c4  : org.uacalc.alg.conlat.BinaryRelation = [[0, 0], [0, 1], [0, 3], [0, 4]
                                                  //| , [1, 1], [1, 2], [1, 4], [1, 5], [2, 0], [2, 2], [2, 3], [2, 5], [3, 0], [3
                                                  //| , 2], [3, 3], [3, 5], [4, 0], [4, 1], [4, 3], [4, 4], [5, 1], [5, 2], [5, 4]
                                                  //| , [5, 5]]
  val partitions: java.util.List[BasicPartition] = ArrayBuffer(a, b1, b2, b3)
                                                  //> partitions  : java.util.List[org.uacalc.alg.conlat.BasicPartition] = [|0,1,2
                                                  //| |3,4,5|, |0,3|1,4|2,5|, |0,4|1,5|2,3|, |0,5|1,3|2,4|]
  val A = BasicPartition.unaryPolymorphismsAlgebra(partitions)
                                                  //> A  : org.uacalc.alg.SmallAlgebra = org.uacalc.alg.BasicAlgebra@222f8903
  val conlat = A.con().getUniverseList()          //> a and b: 0, 1
                                                  //| a and b: 0, 2
                                                  //| a and b: 0, 3
                                                  //| a and b: 0, 4
                                                  //| a and b: 0, 5
                                                  //| a and b: 1, 2
                                                  //| a and b: 1, 3
                                                  //| a and b: 1, 4
                                                  //| a and b: 1, 5
                                                  //| a and b: 2, 3
                                                  //| a and b: 2, 4
                                                  //| a and b: 2, 5
                                                  //| a and b: 3, 4
                                                  //| a and b: 3, 5
                                                  //| a and b: 4, 5
                                                  //| conlat  : java.util.List[org.uacalc.alg.conlat.Partition] = [|0|1|2|3|4|5|, 
                                                  //| |0,3|1,4|2,5|, |0,4|1,5|2,3|, |0,5|1,3|2,4|, |0,1,2|3,4,5|, |0,1,2,3,4,5|]
}