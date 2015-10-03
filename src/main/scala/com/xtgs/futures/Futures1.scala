package com.xtgs.futrues

import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Futures1 extends App {
	
	implicit val baseTime = System.currentTimeMillis

	val f = Future {
		Thread.sleep(500)
		1 + 1
	}

	val result = Await.result(f, 1 second)
	println(result)

	Thread.sleep(1000)
}
