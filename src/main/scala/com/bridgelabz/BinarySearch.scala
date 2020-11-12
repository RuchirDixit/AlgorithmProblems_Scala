package com.bridgelabz

object BinarySearch {

  /**
   *
   * @param array : Array passed to search in
   * @param Element_to_Search : Element to search
   * @param low : lowerlimit of array
   * @param high : upperlimit of array
   * @tparam T: generic
   * @return : Index element; -1 of not found
   */
    def RecursiveBinarySearch[T](array: Array[T],
                              Element_to_Search: T)
                             (low: Int = 0,
                              high: Int = array.length - 1): Int =
    {

      // If element not found
      if (low > high)
        return -1
      var middle = low + (high - low) / 2

      // If element found
      if (array(middle).equals(Element_to_Search))
        return middle

      // Searching in the left half
      else if (array(middle).equals(Element_to_Search) != 0 || array(middle).equals(Element_to_Search) != 1 )
        return RecursiveBinarySearch(array,
          Element_to_Search)(low, middle - 1)

      // Searching in the right half
      else
        return RecursiveBinarySearch(array,
          Element_to_Search)(middle + 1, high)
    }

    // Creating main function
    def main(args: Array[String]){
      var index = RecursiveBinarySearch(Array(1, 2, 3, 4, 55,
        65, 75), 4)(0, 6);

      // If value not found
      if(index == -1)
        print("Not Found")

      // Else print the index where
      // the value is found
      else
        println("Element found at Index " + index)
      var index1 = RecursiveBinarySearch(Array("mango", "banana", "orange", "apple"), "banana")(0, 6);

      // If value not found
      if(index1 == -1)
        print("Not Found")

      // Else print the index where
      // the value is found
      else
        println("Element found at Index " + index1)

    }
  }
