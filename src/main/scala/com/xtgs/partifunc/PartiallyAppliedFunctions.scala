package com.xtgs.partifunc


object PartiallyAppliedFunctions extends App {

	def sum(a: Int, b: Int, c: Int) = a + b + c
	val sum3 = sum _
	println(sum3(1, 2, 3))

	val sum2 = sum(1, _:Int, _:Int)
	println(sum2(2, 3))

	val sum1 = sum(1, _:Int, 1)
	println(sum1(100))
}