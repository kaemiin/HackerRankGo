package kaemiin.hackerrank.helloworldntimes

object Solution {

	def f(n: Int) = {

		var a = 0

		for (a <- 1 to n if n <= 50) {

			println("Hello World")

		}

	}

	def fSingleLine(n: Int) = {var a = 0; for (a <- 1 to n if n <= 50) println("Hello World")}

	def main(args: Array[String]) = {

		//f(args(0).toInt)
		fSingleLine(args(0).toInt)

	}

}
