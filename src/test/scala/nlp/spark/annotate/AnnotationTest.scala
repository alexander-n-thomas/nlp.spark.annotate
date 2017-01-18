package nlp.spark.annotate

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.immutable.TreeSet

@RunWith(classOf[JUnitRunner])
class AnnotationTest extends FunSuite {
  test("ordering") {
    val ordering = implicitly[Ordering[Annotation]]
    assert(ordering.equiv(Annotation("a", 0, 10), Annotation("a", 0, 10)))
    assert(ordering.lt(Annotation("a", 0, 10), Annotation("a", 1, 10)))
    assert(ordering.lt(Annotation("a", 0, 11), Annotation("a", 0, 10)))
    assert(ordering.lt(Annotation("a", 0, 10), Annotation("b", 0, 10)))
  }

  test("get covering") {
    println(TreeSet(Annotation("a", 0, 10), Annotation("a", 1, 10)).range(Annotation("", 0, 10), Annotation("", 0, 10)))
  }
}
