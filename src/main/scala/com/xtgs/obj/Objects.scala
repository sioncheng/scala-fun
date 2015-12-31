package com.xtgs.obj

object Greeting {
	def english = "hi"

	def chinese = "nihao"

	def deutsh = "hallo"
}

//campanion object
class Movie(val name: String, val year: Short) {
	override def toString() = name + " @ " + year
}

object Movie {
	def movieFromYear(year: Short) = {
		year match {
			case 1930 => Some(new Movie("All Quiet On the Western Front", 1930))
			case 1931 => Some(new Movie("Cimarron", 1931))
			case _ => None
		}
	}
}

// a companion object stores shared variables and values for every instantiated class.
class SecretAgent (val name: String) {
	def shoot(n: Int) {
		SecretAgent.decBullets(n)
	}
}

object SecretAgent  {
	var bullets : Int = 3000

	def decBullets(n : Int) {
		if (n < bullets) bullets = bullets - n
		else bullets = 0
	}
}

object Objects extends App {
	
	println(Greeting.english)

	val x = Greeting
	var y = x 
	var z = y

	println (x eq y) //eq checks for reference

	println(Movie.movieFromYear(1930).get)

	val bond = new SecretAgent("James Bond")
	val felix = new SecretAgent("Felix Leitner")
	val jason = new SecretAgent("Jason Bourne")
	val _99 = new SecretAgent("99")
	val max = new SecretAgent("Max Smart")

	bond.shoot(800)
	felix.shoot(200)
	jason.shoot(150)
	_99.shoot(150)
	max.shoot(200)

	println(SecretAgent.bullets)
}