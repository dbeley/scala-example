object Recursion {
  @scala.annotation.tailrec
  def factorial(n: BigInt, acc:BigInt):BigInt =
    if (n==0) acc else factorial(n-1, n * acc)

  def fac(n:BigInt): BigInt = factorial(n, 1)

  def fibonacci(n: BigInt):BigInt =
    if (n == 0) 0 else if (n == 1) 1 else fibonacci(n-1) + fibonacci(n-2)
}

