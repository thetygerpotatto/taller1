package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxListaTest extends AnyFunSuite {
  val objmax = new MaxLista()

  test("devolver 5 en List(1, 2, 3, 4, 5)") {
    assert(objmax.MaxLin(List(1, 2, 3, 4, 5)) == 5)
  }

  test("devolver 9 en List(1, 2, 3, 4, 5)") {
    assert(objmax.MaxLin(List(1, 9, 2, 3, 4, 5, 8)) == 9)
  }

  test("devolver 1 en List()") {
    assert(objmax.MaxIt(List(1)) == 1)
  }

  test("devolver 3 en List(3)") {
    assert(objmax.MaxIt(List(3)) == 3)
  }

  test ("Devolver 500 en List(100, 200, 300, 400, 500)") {
    assert(objmax.MaxIt(List(100, 200, 300, 400, 500)) == 500)
  }
}
