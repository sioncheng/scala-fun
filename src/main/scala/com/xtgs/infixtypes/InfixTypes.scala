package com.xtgs.infixtypes

case class Person(name: String)
class Loves[A, B] (val a: A, val b: B)



object InfixTypes extends App {
	
	val p1 = new Person("p1")
	val p2 = new Person("p2")
	println(p1.name)

	val loves = new Loves(p1, p2)
	println(loves)


	def af(a: Int) : Int = {
		a + 100
	}

	def announceCouple(couple: Loves[Person,Person]) : String = {
		couple.a.name + " loves " + couple.b.name
	}

	println(af(1))
	
	println(announceCouple(loves))
}