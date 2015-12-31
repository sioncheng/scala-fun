package com.xtgs.func

object Functions {
	
	def main(args: Array[String]) {
		println("high order function")

		def lambda = { x: Int => x + 1 }
		def lambda2 = (x: Int) => x + 1
		def lambda3 = (x: Int) => x + 1

		println(lambda(2))
		println(lambda2.apply(4))
		println(lambda2 == lambda3)

		var incbase = 1
		def clousre = (x : Int) => x + incbase
		println(clousre(2))

		def sumation(x: Int, y: Int => Int) = y(x)
		println(sumation(1,lambda2))
		println(sumation(1,clousre))

		def addWithoutSyntaxSugar(x: Int) = {
			new Function[Int, Int]() {
				def apply(y: Int) = x + y
			}
		}

		println(addWithoutSyntaxSugar(1)(2))

		def addWithSyntaxSugar(x: Int) = (y: Int) => x + y
		println(addWithSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]) 

		def paf = addWithSyntaxSugar(10)
		println(paf(1))
		println(paf(2))

		def makeUpper(xs : List[String]) = xs map {_.toUpperCase}
		println(makeUpper(List("hello","what","are","you","doing","?")))
	}
}