package taller

class Hanoi() { 
    def movsTorresHanoi (n : Int ) : BigInt = {
        if (n == 0) 0
        else  2 * movsTorresHanoi(n - 1) + 1
    }
    
    def TorresHanoi (n : Int, t1: Int, t2: Int, t3: Int) : List[(Int, Int)] = {
      if (n == 0) List()
      if (n == 1) List((t1, t3))
      else ((TorresHanoi(n-1, t1, t3, t2) :+ (t1, t3)) ::: TorresHanoi(n-1, t2, t1, t3))
    }
}
