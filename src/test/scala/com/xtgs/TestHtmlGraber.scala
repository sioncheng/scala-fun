package com.xtgs

import org.scalatest._
import com.xtgs._

class HtmlGraberTestSpec extends FlatSpec with Matchers {
	"Scala Test" should "work" in {
		1 should be (1)
	}

	"fetch method" should "get http://www.douban.com" in {
		val hg =  HtmlGraber("http://www.douban.com")
		val response = hg.fetch()
		assert(response != "")
		println(response)
	}
}
