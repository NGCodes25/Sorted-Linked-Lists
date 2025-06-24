import java.util.LinkedList;
import java.util.Scanner;

/**
 * Entry point for the sorted Linked List program.
 * Accepts user input and maintains a sorted linked list of integers.
 * 
 * @author Nicole Giampapa
 * @version 1.0
 * @since 06/10/2025
 */
public class Main {
    /**
    * Main class for the module setup.
    * @param args not used.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> sortedList = new LinkedList<>();
        
        System.out.println("This program takes integers you enter and stores them in a linked list sorted smallest to largest.");
        System.out.println("\nEnter one integer at a time and hit Enter after each entry.");
        System.out.println("Type 'done' to finish.");

        while (true) {
            String input = scanner.next();

            if (InputValidator.isDone(input)){
                break;
            }

            if (InputValidator.isValidInteger(input)){
                int value = Integer.parseInt(input);
                SortedLinkedList.insertSorted(sortedList, value);
            } else {
                System.out.println("Invalid input. Please enter an integer or 'done'.");
            }
        }
        //code reuse - peekFirst and peekLast are methods of the LinkedList classs
        System.out.println("The first element of your list is: " + sortedList.peekFirst());
        System.out.println("The last element of your list is: " + sortedList.peekLast());
        System.out.println("The complete sorted list is: " + sortedList);
        scanner.close();
    }
}
