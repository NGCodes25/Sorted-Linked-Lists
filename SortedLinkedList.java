import java.util.LinkedList;

/**
 * Provides methods for inserting integers into a LinkedList in sorted order.
 * Sort order is from smallest to largest.
 */
public class SortedLinkedList {
    /**
     * Inserts a value into the LinkedList in the correct position to keep it sorted.
     * 
     * @param list the list the LinkedList inserts into
     * @param value the integer value to insert
     */
    public static void insertSorted(LinkedList<Integer> list, int value) {
        int i = 0;
        while(i < list.size() && list.get(i) < value){
            i++;
        }
        //code reuse - size, get and add are all public methods of the LinkedList class
        list.add(i,value);        
    }

} 
