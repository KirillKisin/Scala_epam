//Лабораторная работа 5, Часть 2, Вариант 6
object ElementFounder {
  def main(args: Array[String]): Unit = {
    val elements = List[Int](7, 5, -43, 6, -67, 3, 6)
    var lessThenSubjected: List[Int] = List[Int]()
    println(elements)
    println(foundElem(elements, elements.size - 1))
    println(foundElements(elements, elements.length - 1))
  }

  //без рекурсии
  def foundElem(elements: List[Int], index: Int): List[Int] = {
    var requiredElements = List[Int]()
    for (i <- 2 to index) {
      if (elements(i) < elements(i - 1) - elements(i - 2)) {
        val secondList = elements(i) :: requiredElements
        requiredElements = secondList.head :: requiredElements
      }
    }
    requiredElements
  }

  //рекурсия
  def foundElements(elements: List[Int], index: Int): List[Int] = {
    var requiredElements = List[Int]()

    def found(elements: List[Int], index: Int): List[Int] = {
      if (index > 1) {
        if (elements(index) < elements(index - 1) - elements(index - 2)) {
          val secondList = elements(index) :: requiredElements
          requiredElements = secondList.head :: requiredElements
        }
        found(elements, index - 1)
      }
      requiredElements
    }

    found(elements, index)
    requiredElements
  }

}
