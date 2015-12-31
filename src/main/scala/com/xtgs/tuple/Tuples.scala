package com.xtgs.tuple

object Tuples extends App {

	val t = new Tuple7(1,2,3,4,5,6,7)

	println(t)
	println(t._1)
	println(t._2)
	println(t._3)
	println(t._4)
	println(t._5)

	val t2 = ("A",1,2)
	println(t2)
}