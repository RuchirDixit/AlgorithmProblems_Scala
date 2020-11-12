package com.bridgelabz
object InsertionSort{


  // creating main method
  def main(args: Array[String]) {

    println(insertionSort(Array(0, 5, 2, 6, 3, 1)));
    println(insertionSort(Array("zebra","camel","lion")));

  }

  /**
   *
   * @param array : array to sort
   * @tparam T : generic type
   */
  def insertionSort[T <% Ordered[T]](array: Array[T]) {
    //first element is considered as sorted sublist
    for (outer <- 1 until array.length) {

      var temp = array.apply(outer)

      var inner = outer - 1
      // temp < array.apply(inner) is used for Ascending sort
      while (inner >= 0 && temp < array.apply(inner)) {
        array.update(inner + 1, array.apply(inner))
        inner -= 1
      }
      array.update(inner + 1, temp)
    }
  }
}
