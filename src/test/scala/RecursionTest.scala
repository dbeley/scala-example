  import org.scalatest.FunSuite

class RecursionTest extends FunSuite {
  test("Recursion.fac") {
    assert(Recursion.fac(3) === 6)
    assert(Recursion.fac(4) === 24)
    assert(Recursion.fac(5) === 120)
    assert(Recursion.fac(10) === 3628800)
    assert(Recursion.fac(0) === 1)
  }

  test("Recursion.fibonacci") {
    assert(Recursion.fibonacci(0) === 0)
    assert(Recursion.fibonacci(1) === 1)
    assert(Recursion.fibonacci(2) === 1)
    assert(Recursion.fibonacci(3) === 2)
    assert(Recursion.fibonacci(6) === 8)
    assert(Recursion.fibonacci(10) === 55)
    assert(Recursion.fibonacci(15) === 610)
  }
}
