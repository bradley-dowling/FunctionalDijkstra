object Main extends App {

  // create the graph
  val graph = Map(
    "home" -> Seq(("a", 1), ("c", 0), ("d", 1)),
    "a" -> Seq(("b", 1), ("e", 2)),
    "b" -> Seq(("c", 2), ("e", 7)),
    "c" -> Seq(("e", 6)),
    "d" -> Seq(("f", 5), ("g", 8)),
    "e" -> Seq(("h", 3), ("f", 4)),
    "f" -> Seq(("g", 0), ("i", 3)),
    "g" -> Seq(("i", 3)),
    "h" -> Seq(("office", 8)),
    "i" -> Seq(("office", 1))
  )
}
