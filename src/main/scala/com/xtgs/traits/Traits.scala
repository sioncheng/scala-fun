package com.xtgs.traits 

trait Similarity {
	def isSimilar(x: Any): Boolean
	def isNotSimilar(x: Any) : Boolean = !isSimilar(x)
}

class Point(xc: Int, yc: Int) extends Similarity {
	var x : Int = xc
	var y : Int = yc

	def isSimilar(obj: Any) = {
		obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
	}
}

trait TraitsOwnState {
	var state : Int = 0

	def whichStateNow() : Int = {
		val s = state
		state += 1
		s
	}
}

class H extends TraitsOwnState


object TraitsApp extends App {
	val p1 = new Point(1,2)
	val p2 = new Point(1,3)

	println(p1.isSimilar(p2))

	var h = new H()
	println(h.whichStateNow)
	println(h.whichStateNow)
}