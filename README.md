# Scala ListBuffer IndexOutOfBoundsException

This repository demonstrates a common error in Scala involving the `ListBuffer` data structure: accessing an index that's beyond the list's bounds.  The code in `bug.scala` attempts to access an element at index 3 of a `ListBuffer` containing only three elements (indices 0, 1, and 2).  This results in an `IndexOutOfBoundsException`.

The solution, found in `bugSolution.scala`, shows how to safely handle this by checking the index's validity before accessing it or by using safer methods.