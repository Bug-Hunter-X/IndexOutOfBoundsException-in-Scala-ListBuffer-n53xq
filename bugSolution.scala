```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Check if the index is within bounds
  val index = 3
  if (index >= 0 && index < list.length) {
    println(list(index))
  } else {
    println(s"Index $index is out of bounds")
  }

  // safer alternative using getOrElse
  println(list.getOrElse(3, -1)) // returns -1 if index 3 is out of bounds
}
```