val s = List.range(1, 100)

val g = s.sum   // g.reduce(_ + _)

val k = s.take(10).product  //s.take(10).fold(0)(_ + _)

val t = s.reduce(_ + _)

val te = s.fold(10)(_ + _)