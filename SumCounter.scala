//Лабораторная работа 6, Часть 2, Вариант 6
import scala.annotation.tailrec
object SumCounter {
  def main(args: Array[String]): Unit = {
    val elements = List[Int](7, 5, 43, 6, 67, 3, -6)
    println(elements)
    println(elements.foldRight(0)(_+_))//посчитано с использованием fold
    println(elements.sum)//посчитано встроенной функцией
    println(getSum(elements))//посчитано рекурсивной функцией
  }
  def getSum(listOfNumbers: List[Int]): Int = {
    val sizeOfList = listOfNumbers.length

    @tailrec
    def accumulator(acc: Int, listOfNumbers: List[Int], sizeOfList: Int): Int = {
      if (sizeOfList != 0)
        accumulator(acc + listOfNumbers(sizeOfList - 1), listOfNumbers, sizeOfList - 1)
      else
        acc
    }
    accumulator(0, listOfNumbers, sizeOfList)
  }
}
