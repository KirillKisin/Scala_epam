//Лабораторная работа 5, Часть 1, Вариант 6
object UpperCase {
  def main(args: Array[String]): Unit = {
    println("Enter your string:")
    val str: String = scala.io.StdIn.readLine()
    println(upCase(str));
  }

  def upCase(str: String): String = {
    if (str.length > 0)
      str.toUpperCase()
    else
      str + "You entered an empty string"
  }
}
