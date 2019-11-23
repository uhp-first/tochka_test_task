package first

object First extends App {

  val in = "asdasdaaaweqbbbbasdasd"

  val first = in
    .toList
    .filter(p => p.isLetter)
    .sorted(Ordering.Char)
    .mkString
  println(first) // aaaaaaabbbbddddeqssssw

  val second = in
    .foldLeft[Map[Char,Int]](Map.empty)((map, c) => map + (c -> (map.getOrElse(c, 0) + 1)))
    .toList
    .sortWith(_._2 > _._2)
    .map(t => t._1.toString * t._2)
    .mkString

  println(second) // aaaaaaassssddddbbbbwqe

}

