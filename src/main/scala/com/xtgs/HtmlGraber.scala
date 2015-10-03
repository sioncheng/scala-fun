package com.xtgs

import io.Source

class HtmlGraber (url: String) {
	override def toString() = "html graber " + url

	def fetch() : String = {
		val in = Source.fromURL(url, "utf8")
		val response = in.getLines.mkString
		in.close()
		return response
	}
}

object HtmlGraber {
	def apply (url: String) = new HtmlGraber(url)
}