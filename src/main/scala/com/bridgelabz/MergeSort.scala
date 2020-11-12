package com.bridgelabz
import math.Ordering
object MergeSort {
  /**
   *
   * @param list : List to sort
   * @param order : Type to sort
   * @tparam T : Generics
   * @return : Sorted List
   */
  def mergeSort[T](list: List[T])(order: Ordering[T]): List[T] = {
    def merge(left: List[T], right: List[T]): List[T] = (left, right) match {
      case (Nil, _) => right
      case (_, Nil) => left
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (order.lt(leftHead, rightHead))
          leftHead :: merge(leftTail, right)
        else
          rightHead :: merge(left, rightTail)
    }

    val splitBy = list.length / 2
    if (splitBy == 0)
      list
    else {
      val (a, b) = list splitAt splitBy
      merge(mergeSort(a)(order), mergeSort(b)(order))
    }
  }

  // main method
    def main(args : Array[String]) = {

      val list = List(9, 5, 16, 3, 4, 11, 8, 12)
      println(mergeSort(list)(Ordering[Int]))
      val listString = List("zebra", "lion", "ant")
      println(mergeSort(listString)(Ordering[String]))
    }

}
