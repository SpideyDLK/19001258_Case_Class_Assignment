import scala.math.pow

object Case extends App{

  def add(a:point,b:point):point={
    val x = a.x+b.x
    val y = a.y+b.y
    val res = point(x,y)
    return res
  }
  def distance(a:point,b:point):Double={
    return pow((pow((b.x-a.x),2)+pow((b.y-a.y),2)),0.5)
  }

  val p1 = point(1,22)
  val p2 = point(10,28)

  println(s"$p1 + $p2 = ${add(p1,p2)}")
  println(s"Move $p2 by dx = 100, dy = -50 : ${p2.move(100,-50)}")
  println(s"Distance between $p1 and $p2 is : ${distance(p1,p2)}")
  println(s"Inverse of $p1 and $p2 : ${p1.invert()} , ${p2.invert()}")



}

case class point(a: Int,b: Int){
  def x: Int = a
  def y: Int = b

  def move(dx: Int,dy: Int):point={
    val res = this.copy(this.x + dx,this.y + dy)
    return res
  }
  def invert():point={
    val res = this.copy(this.y,this.x)
    return res
  }
}
