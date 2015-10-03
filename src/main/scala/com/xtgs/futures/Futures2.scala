package com.xtgs.futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure,Success}
import scala.util.Random


object Futures2 extends App {
	def sleep(t:Int) {Thread.sleep(t)}

	val f = Future {
		sleep(Random.nextInt(500))
		4
	}

	f.onComplete {
		case Success(value) => println(s"callback $value")
		case Failure(e) => e.printStackTrace
	}

	println("A ..."); sleep(100)
	println("B ..."); sleep(100)
	println("C ..."); sleep(100)
	println("D ..."); sleep(100)
	println("E ..."); sleep(100)
	println("F ..."); sleep(100)
	
	sleep(2000)

}