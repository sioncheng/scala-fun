package com.xtgs.classes

class Point (xc: Int, yc: Int) {

	var x: Int = xc
	var y: Int = yc

	def move(dx: Int, dy: Int) {
		x = x + dx
		y = y + dy
	}

	override def toString() = "("  + x + "," + y + ")"
}

object Classes extends App {

	val pt = new Point(1, 2)
	println(pt)
	
	pt.move(3, 3)
	println(pt)

}

object Classes2 {

	def main(args: Array[String]) {
		val pt = new Point(2, 2)
		println(pt)
		
		pt.move(3, 3)
		println(pt)
	}
}