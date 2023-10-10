import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
      for (int number : numbers){
          System.out.println(number);
      }

        // Removing an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1 (20)

        // Updated ArrayList
        System.out.println("Updated elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
