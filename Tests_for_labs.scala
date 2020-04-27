package labTest

import UpperCase
import UpperCase2
import SumCounter
import ElementFounder
import DeleteExtra
import org.scalatest.FunSuite


class AllTest extends FunSuite{

  test("upCase.uppercase") {
    assert(UpperCase.upCase(String("how are you?")) === ("HOW ARE YOU?"))
    assert(UpperCase.upCase(String("")) === ("You entered an empty string"))
  }

  test("upCase.uppercase2") {
    assert(UpperCase2.upCase(String("how are you?")) === ("How Are You?"))
    assert(UpperCase2.upCase(String("")) === ("You entered an empty string"))
  }

  test("getSum.sumcounter") {
    assert(SumCounter.getSum(List(7, 5, 43, 6, 67, 3, -6)) === (125))
    assert(SumCounter.getSum(List(7, 5)) === (12))
  }

  test("main.deleteextra") {
    assert(DeleteExtra.main(Array() === (Map(2->1,3->2))
  }

  test("foundElem.elementfounder") {
    assert(elementfounder.foundElem(List(7, 5, -43, 6, 67, 3, 6),7) === (List(6, -67, -43)))
    assert(elementfounder.foundElem(List(7, 5, -43, 6, 67, 3),6) === (List(-67, -43)))
  }

  test("foundElememts.elementfounder") {
    assert(elementfounder.foundElements(List(7, 5, -43, 6, 67, 3, 6),7) === (List(-43, -67, 6)))
    assert(elementfounder.foundElements(List(7, 5, -43, 6, 67, 3),6) === (List(-43, -67)))
  }
}
