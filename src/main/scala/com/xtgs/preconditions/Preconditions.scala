package com.xtgs.preconditions


class Rational(n: Int, d: Int) {
	require(d != 0)

	override def toString() = n + "/" + d

	def someFunc(x: Int) : Rational =  {
		require(x != 0)
		new Rational(n, d / x)
	}
}

object Preconditions extends App {
	
	val r1 = new Rational(1,2)
	println(r1)
	println(r1 someFunc 0)
}