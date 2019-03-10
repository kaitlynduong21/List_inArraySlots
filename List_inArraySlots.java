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

  public boolean add(int index, int value) {
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

  public int get (int index) {
    return elements[index];
  }

  public int set (int index, int newValue) {
    int original = elements[index];
    elements[index] = newValue;
    return original;
  }


  public int remove (int index) {
    if (index <  0 || index >  filledElements) {
      throw new IllegalArgumentException();
    }
    int original = elements[index];
    for (int i = index; i < filledElements - 1; i++) {
      elements[i] = elements[i+1];
    }

    filledElements--;
    return original;
  }
}
