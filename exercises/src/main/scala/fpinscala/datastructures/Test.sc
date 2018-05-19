import fpinscala.datastructures.{Cons, List, Nil}

val x: List[Int] = List(1, 2, 3, 4)
val y: List[Int] = List(11, 12, 13, 14)

def init[A](l: List[A]): List[A] = {
  l match {
    case Nil => Nil
    case Cons(_, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }
}

init(x)



