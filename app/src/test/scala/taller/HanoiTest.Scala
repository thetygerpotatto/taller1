package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HanoiTest extends AnyFunSuite {
val objHanoi = new Hanoi()

test("Encontrar 3 en List(1, 2, 3, 4, 5)") {
    assert(objHanoi.movsTorresHanoi(3 ) == 7)
}
}
