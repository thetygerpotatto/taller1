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

  test("devolver 9 en List(1, 9, 2, 3, 4, 5, 8)") {
    assert(objmax.MaxLin(List(1, 9, 2, 3, 4, 5, 8)) == 9)
  }

  test("devolver 15 en List(1, 9, 2, 3, 4, 5, 8, 15, 15)") {
    assert(objmax.MaxLin(List(1, 9, 2, 3, 4, 5, 8, 15, 15)) == 15)
  }

  test("devolver 20 en List(0, 2, 0, 0, 6, 20)") {
    assert(objmax.MaxLin(List(0, 2, 0, 0, 6, 20)) == 20)
  }
  
  test("devolver 102 en List(100, 99, 88, 102, 97)") {
    assert(objmax.MaxLin(List(100, 99, 88, 102, 97)) == 102)
  }
  
  test("devolver 1 en List(1)") {
    assert(objmax.MaxIt(List(1)) == 1)
  }

  test("devolver 14 en List(3, 14, 5)") {
    assert(objmax.MaxIt(List(3, 14, 5)) == 14)
  }

  test ("Devolver 500 en List(100, 200, 300, 400, 500)") {
    assert(objmax.MaxIt(List(100, 200, 300, 400, 500)) == 500)
  }
  
  test ("Devolver 3 en List(1, 1, 1, 1, 3)") {
    assert(objmax.MaxIt(List(1, 1, 1, 1, 3)) == 3)
  }
  
  test ("Devolver 500 en List(0, 65, 32, 27, 500)") {
    assert(objmax.MaxIt(List(0, 65, 32, 27, 500)) == 500)
  }
}
