package com.xtgs.option


object Options extends App {
	
	val someValue : Option[String] = Some("hello world")
	val nullValue : Option[String] = None

	println(someValue)
	println(nullValue)

	val someNumber : Option[Int] = Some(124)
	val nullNumber : Option[Int] = None

	println(someNumber)
	println(nullNumber)

	/*
	it is not ok
	val result = someNumber * 4
	println(result)
	*/

	val result = someNumber.map(_ * 4) //type still is Option[Int]
	println(result)

	println(result.getOrElse(0))
}