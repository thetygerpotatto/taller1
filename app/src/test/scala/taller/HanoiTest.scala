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
    
    test("n = 7 retorna 127") {
        assert(objHanoi.movsTorresHanoi(7) == 127)
    }

    test("n = 10 retorna 1023") {
        assert(objHanoi.movsTorresHanoi(10) == 1023)
    }

    test("n = 25 retorna 33554431") {
        assert(objHanoi.movsTorresHanoi(25) == 33554431)
    }

    test("n == 2 retorna (1, 2), (1, 3), (2, 3)") {
      assert(objHanoi.TorresHanoi(2, 1, 2, 3) == List((1, 2), (1, 3), (2, 3)))
    }


    test("n == 3 retorna (1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)") {
      assert(objHanoi.TorresHanoi(3, 1, 2, 3) == List((1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)))
    }
}
