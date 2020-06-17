  import org.scalatest.FunSuite

class RecursionTest extends FunSuite {
  test("Recursion.fac") {
    assert(Recursion.fac(3) === 6)
    assert(Recursion.fac(4) === 24)
    assert(Recursion.fac(5) === 120)
    assert(Recursion.fac(10) === 3628800)
    assert(Recursion.fac(0) === 1)
  }
}
