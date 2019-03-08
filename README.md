# implement a list by storing data in an encapsulated array
By Kaitlyn Duong and Michael Robertson


Design `List_inArraySlots` to implement a list of integers. It is required to be able to store any values that an `int` can hold, in consecutive slots of an array of `int`s.

In general, the array will be only partially populated with list elements. That is, the array is generally larger than this list. Occasionally, the array can be completely full, but adding another element to the list will cause the `List_inArraySlots` class to`expand()` the list (see the header comments for that method in the skeleton.

That requirement "to store any values that an `int` can hold" implies that the implementation can **not** identify the end of the list by the values of the integers stored in the list. That design decision would require reserving one integer value as a value that cannot be stored in the list.

## List_inArraySlots Class

### Fields

`private int size`

`private int[] list`

### Constructors

//Constructor that creates a List_inArraySlots of a default size

`public List_inArraySlots()`

//Constructor that creates a List_inArraySlots of a given size

`public List_inArraySlots(int size)`

### Methods

//adds element to end by default

`public void add(int element)`

//adds element at a given position

`public void add(int index, int element)`

//removes an element at a given position

`public void remove(int index)`

//gets the element at a given position

`public void get(int index)`

//sets the element at a given position to the given element, returns the original element at the index

`public T set(int index, int element)`

//returns the number of filled elements

`public int count()`

## UserOfList Class

- Will create a reference to an object of type List_inArraySlots
- Will call the methods that are defined in the List_inArraySlots class
