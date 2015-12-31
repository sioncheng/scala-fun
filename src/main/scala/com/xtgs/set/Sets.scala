package com.xtgs.set

object Sets extends App {
	
	var s1 = Set("a", "b", "c", "d", "e")
	var s2 = Set("a", "b", "c", "d", "e")

	println(s1 eq s2)
	println(s1 == s2)

	println(s1.size)

	println(s1.contains("b"))
}