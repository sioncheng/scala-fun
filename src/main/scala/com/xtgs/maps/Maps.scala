package com.xtgs.maps

object Maps extends App {

	var m1 = Map("x" -> 1, "y" -> 2)
	var m2 = Map(("x", 1), ("y", 2))

	println(m1 == m2)
	println(m1 eq m2)

	println(m1.size)
	println(m2.contains("x"))
	println(m2("x"))

	println(m2 - "y")

}