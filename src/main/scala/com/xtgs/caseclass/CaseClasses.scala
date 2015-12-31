package com.xtgs.caseclass

case class A(a: String)
case class AB(a: String, b: String)
case class ABC(a: Int, b: Int, c: Int)


object CaseClasses extends App {
	
	val a = A("1")
	val ab = AB("1", "2")
	val abc = ABC(1, 2, 3)
	val a1 = A("1")

	println(a)
	println(ab)
	println(abc)

	println(a eq a1)
	println(a == a1)

	def test(x: Any) {
		x match {
			case A("1") => println(1)
			case A(a) => println(a)
			case _ => println("no match")
		}
	}

	test(A("2"))
	test(A("1"))
}