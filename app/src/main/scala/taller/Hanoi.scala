package taller

class Hanoi() { 
    def movsTorresHanoi (n : Int ) : BigInt = {
        if (n == 0) 0
        else  2 * movsTorresHanoi(n - 1) + 1
    }
    
    def TorresHanoi (n : Int, t1: Int, t2: Int, t3: Int) : List[(a: Int, b:Int)] = {
        
    }
}
