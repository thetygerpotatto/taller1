package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HanoisTest extends AnyFunSuite {

val objHanoi = new Hanoi()

    test("n = 0 retorna 0") {
        assert(objHanoi.movsTorresHanoi(3) == 7)
    }

    test("n = 5 retorna 31") {
        assert(objHanoi.movsTorresHanoi(5) == 31)
    }
}