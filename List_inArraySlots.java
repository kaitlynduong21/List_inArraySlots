/**
Implement a elements of integer elements, including
both data and operations.
*/

public class List_inArraySlots {

  private int filledElements;
  private int[] elements;

  private static final int INITIAL_CAPACITY = 10;

  /**
  Construct an empty elements with a small initial capacity.
  */
  public List_inArraySlots() {
    elements = new int[INITIAL_CAPACITY];
  }

  /**
  @return the number of elements in this elements
  */

  public int size() {
    return filledElements;
  }

  /**
  @return a string representation of this elements,
  in [a,b,c,] format
  */
  public String toString() {
    String s = "[";
    for (int i = 0; i < filledElements; i ++) {
      s += elements[i] + ",";
    }
    s += "]";
    return s;
  }

  /**
  Appends @value to the end of this elements.

  @return true, in keeping with conventions yet to be discussed
  */
  public boolean add(int value) {
    if (filledElements == elements.length) {
      expand();
    }
    elements[filledElements] = value;
    filledElements++;
    return true;
  }

/**
Double the capacity of the List_inArraySlots,
preserving existing data
*/
  private void expand() {
    int[] expandedList = new int [elements.length * 2];
    for (int i = 0; i < elements.length; i++) {
      expandedList[i] = elements[i];
    }
    elements = expandedList;
  }

  /**
     accessor
     @return element @index from this list
     precondition: @index is within the bounds of the array.
         (Having warned the user about this precondition,
          you should NOT complicate your code to check
          whether user violated the condition.)
    */

  public int get (int index) {
    return elements[index];
  }

  /**
     Set value at @index to @newValue
     @return old value at @index
     @precondition: @index is within the bounds of this list.
    */

  public int set (int index, int newValue) {
    int original = elements[index];
    elements[index] = newValue;
    return original;
  }

  /**
        Insert @value at position @index in this list.
        Shift the element currently at that position (if any)
        and any subsequent elements to the right
        (that is, increase the index associated with each).
       */
  public void add(int index, int value) {
    if (filledElements == elements.length)
    expand();
    for (int i = filledElements; i > index; i--) {
      elements[i] = elements[i - 1];
    }
    elements[index] = value;
    filledElements++;
    return true;
  }

  /**
        Remove the element at position @index in this list.
        Shift any subsequent elements to the left (that is,
        decrease the index associated with each).
        @return the value that was removed from the list
       */

  public int remove (int index) {
    int original = elements[index];
    for (int i = index; i < filledElements - 1; i++) {
      elements[i] = elements[i+1];
    }

    filledElements--;
    return original;
  }
}
