object Recursion {
  @scala.annotation.tailrec
  def factorial(n: BigInt, acc:BigInt):BigInt =
    if (n==0) acc else factorial(n-1, n * acc)

  def fac(n:BigInt): BigInt = factorial(n, 1)
}
