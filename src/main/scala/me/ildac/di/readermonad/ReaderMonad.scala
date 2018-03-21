package me.ildac.di.readermonad

case class Reader[C, A](g: C => A) {
    def apply(c: C) = g(c)
    def map[C](f: A => B): Reader[C, B] = 
        c => f(g(c))
    def flatmap[B](f: A => Reader[C, B]): Reader[C, B] =
        c => f(g(c))(c)
}

def pure[A](a: A): C => A = c => a

implict def reader[A,B](f: A => B) = Reader(f)