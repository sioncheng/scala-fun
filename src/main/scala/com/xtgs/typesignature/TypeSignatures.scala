package com.xtgs.typesignature

trait Randomizer[A] {
	def next() : A
}

class IntRandomizer extends Randomizer[Int] {
	def next() : Int = {
		import util.Random
		Random.nextInt()
	}
}

object TypeSignatures extends App {
	
	val ll : List[String] = "a" :: "b" :: "c" :: "d" :: Nil
	println(ll)

	val ir = new IntRandomizer()
	println(ir.next)
}