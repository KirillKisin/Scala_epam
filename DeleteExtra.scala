//Лабораторная работа 6, Часть 3, Вариант 6
object DeleteExtra {
  def main(args: Array[String]): Unit = {
    var map: Map[Int, Int] = Map(2 -> 1, 1 -> 1, 3 -> 2)
    println(map)
    for (i <- 0 until map.size) {
      for (j <- i until map.size) {
        if ( map.get(i) ==  map.get(j))
          map-=i
      }
    }
    println(map)
  }
}
