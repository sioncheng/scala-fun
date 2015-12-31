package com.xtgs.iterable

object Iterables extends App {
	val l = List(1,2,3,4,5)
	val it = l.iterator
	println(it.next)

	val slid = l.sliding(3)
	println(slid.next, slid.next, slid.next)
}