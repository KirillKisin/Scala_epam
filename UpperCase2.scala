//Лабораторная работа 6, Часть 1, Вариант 6
object UpperCase2 {
  def main(args: Array[String]): Unit = {
    println("Enter your string:")
    val str: String = scala.io.StdIn.readLine()
    println(upCase(str));
  }

  def upCase(str: String): String = {
    if (str.length > 0) {
      val chars: Array[Char] = str.toCharArray

      for (i <- chars.indices) {
        if (i == 0 || chars(i - 1) == ' ')
          chars(i) = Character.toUpperCase(chars(i))
      }
      val str1: String = new String(chars)
      str1
    }
    else
      str + "You entered an empty string"
  }
}
