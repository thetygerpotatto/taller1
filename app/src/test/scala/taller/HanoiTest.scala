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


    test("n == 3 retorna (5, 1), (5, 3), (1, 3), (5, 1), (3, 5), (3, 1), (5, 1)") {
      assert(objHanoi.TorresHanoi(3, 5, 3, 1) == List((5, 1), (5, 3), (1, 3), (5, 1), (3, 5), (3, 1), (5, 1)))
    }

    test ("n == 4 retorna (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3)") {
      assert(objHanoi.TorresHanoi(4, 1, 2, 3) == List((1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3)))
    }

    test ("n == 5 retorna (7,9), (7,3), (9,3), (7,9), (3,7), (3,9), (7,9), (7,3), (9,3), (9,7), (3,7), (9,3), (7,9), (7,3), (9,3), (7,9), (3,7), (3,9), (7,9), (3,7), (9,3), (3,9), (7,9), (7,3), (9,3)") {
      assert(objHanoi.TorresHanoi(5, 7, 3, 9) == List((7,9), (7,3), (9,3), (7,9), (3,7), (3,9), (7,9), (7,3), (9,3), (9,7), (3,7), (9,3), (7,9), (7,3), (9,3), (7,9), (3,7), (3,9), (7,9), (3,7), (9,3), (3,9), (7,9), (7,3), (9,3)))
    }

    test ("n == 6 retorna (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (3,2), (1,3), (2,3), (2,1), (3,1), (2,3), (2,1), (3,1), (3,2), (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3)") {
      assert(objHanoi.TorresHanoi(6, 1, 2, 3) == List((1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (3,2), (1,3), (2,3), (2,1), (3,1), (2,3), (2,1), (3,1), (3,2), (1,2), (1,3), (2,3), (1,2), (3,1), (3,2), (1,2), (1,3), (2,3), (2,1), (3,1), (2,3), (1,2), (1,3), (2,3)))
    }
}
