import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicates {
  public static void main(String[] args) {

    // create an array list from the array
    // using asList() method of the Arrays class
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
    System.out.println("ArrayList with duplicate elements: " + numbers);

    // convert the array list into a set
    Set<Integer> set = new LinkedHashSet<>();
    set.addAll(numbers);

    // delete al elements of array list
    numbers.clear();

    // add element from set to array list
    numbers.addAll(set);
    System.out.println("ArrayList without duplicate elements: " + numbers);
  }
}