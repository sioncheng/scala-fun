package com.xtgs.list

object Lists extends App {
	
	var l1 = List(1,2,3)
	var l2 = List(1,2,3)
	println(l1 eq l2)
	println(l1 == l2)

	println(l1.head)
	println(l1.tail)
	println(l1(0),l1(1),l1(2))

	println(l1.reverse)

	println(l1.foldLeft(10)(_ + _)) //10 + 1 + 2 + 3

	println(3 :: 2 :: 1 :: Nil)
}