/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package taller

object App {
  def main(args: Array[String]): Unit = {
    greeting()
    println(xd)
  }

  def greeting(): String = "Hello, world!"
  
  val objxd = new Hanoi()
  val xd = objxd.movsTorresHanoi(5)
}
