package com.xtgs.partifunc

object PartialFunctions extends App {
	
	val doubleEvents : PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
		def isDefinedAt(x: Int) = x % 2 == 0
		def apply(x: Int) = x * 2
	}

	println(doubleEvents(2))


	val doubleEvents2 : PartialFunction[Int, Int] = {
		case x : Int if ( x % 2 == 0) => x * 2
	}

	println(doubleEvents2(2))
}