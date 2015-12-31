package com.xtgs.forexp

object ForExpressions extends App {

	val someNumbers = Range(0, 10)
	for (i <- someNumbers) 
		println(i)
	
	val xValues = Range(1,4)
	val yValues = Range(1,3).inclusive

	val xys = for {
		x <- xValues
		y <- yValues
	} yield (x, y)

	println(xys)
}