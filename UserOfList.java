/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list:" + list);

        // /* Populate the list with elements, but with a small enough
           // number that we expect no invocation of expand().
        // */
        int i = 0;
        for( ; i < 5; i++ ) {
            list.add( -i); // differs from index, but similar
            
        }
        System.out.println( list);

        list.add(479,0);
	System.out.println(list);
    }
}
