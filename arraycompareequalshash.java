import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.IntStream;


public class arraycompareequalshash {
    public static void main(String[] args) {
        //Arrays
        int test1[] = { 5, 10, 15, 20, 25}; 
        int test2[] = { 12, 15, 9, 3, 6}; 
        int test3[] = new int[10];


        System.out.println("Array comparison: " + Arrays.compare(test1, test2)); 
        // comparison of arrays

        System.out.println("Array hashcode: " + Arrays.hashCode(test1));
        // displays hascode of the array

        // spliterator of the array: splits the content of the array in the output
        Spliterator<Integer> a = Arrays.spliterator(test1);
        a.forEachRemaining((b)-> System.out.print(b+" "));
        
        // stream in array: streams the array 
        System.out.print("\n");
        IntStream array3 = Arrays.stream(test2);
        array3.forEach(str -> System.out.print(str+" "));  

        System.out.println("\nArray Equal: " + Arrays.equals(test1, test2));
        // returns boolean values acording to the equality of the array

        // used to apply a generator or can say a condition for the elements of the array and automatically fills according to the condition
        Arrays.setAll(test3, (index)-> 3+index);
        for(int i:test3){
            System.out.println(i+" ");
        }
    }
}
