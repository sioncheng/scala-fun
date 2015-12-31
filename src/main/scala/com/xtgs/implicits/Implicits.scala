package com.xtgs.implicits


object MyPredef {
	class StringNumberWrapper(val orignal: String) {
		def addInt(x: Int) = x + orignal.toInt
	}

	implicit def convertToStringNumberWrapper(value: String) = new StringNumberWrapper(value)
}

object Implicits extends App {

	implicit val a = 1

	def sum(x: Int)(implicit base : Int) = x + base

	println(sum(3))


	class IntWrapper(val orignal: Int) {
		def isOdd = orignal % 2 != 0
	}

	implicit def thisMethodNameIsIrrelevant(value: Int) : IntWrapper = {
		println("thisMethodNameIsIrrelevant was called")
		new IntWrapper(value)
	} 

	println(12.isOdd)
	println(13.isOdd)

	import MyPredef._
	println("1".addInt(2))


}