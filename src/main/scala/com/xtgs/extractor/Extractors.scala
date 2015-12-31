package com.xtgs.extractor

object Twice {
	def apply(x: Int) = x * 2
	def unapply(x: Int) : Option[Int] = if (x % 2 == 0) Some (x / 2) else None	
}

case class Person(firstname: String, lastname: String)

class Book(val name: String, val author: String, val isbn: String)

object Book {
	def unapply(b: Book) = Some(b.name, b.author, b.isbn)
}

object Extractors extends App {
	val x = Twice(22)
	x match {
		case Twice(n) => println(n)
		case _ => println("no match")
	}

	val p = Person("Robin", "Williams")
	val result = p match {
		case Person("Robin", lastname) => lastname
		case _ => ""
	}

	println("lastname is " , result)

	val b = new Book("b1", "a1", "isbn1")
	val Book(name, author, isbn) = b
	println(name, author, isbn)
}