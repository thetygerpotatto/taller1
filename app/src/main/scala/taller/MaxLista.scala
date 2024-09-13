package taller
import scala.annotation.tailrec

class MaxLista {
  def MaxLin(l: List[Int]) : Int = {
    if (l.tail.isEmpty) l.head
    else Math.max(l.head, MaxLin(l.tail))
  }

  def MaxIt(l: List[Int]) : Int = {
    @tailrec
    def MaxItAux(max: Int, l: List[Int]): Int = {
      if (l.isEmpty) max 
      else MaxItAux(Math.max(max, l.head), l.tail)
    }

    MaxItAux(0, l)
  }
}
