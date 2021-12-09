import java.util.Arrays;

public class arraycopyandmismatch{
    public static void main(String[] args) {
        int array1[] = { 5, 15, 25, 30}; //initialize array1

        int array2[] = Arrays.copyOf(array1, 8);// copy array1 in array2 completely with new index size
        Arrays.fill(array2, 4, 6, 42);// array2 filled with value 42 from index 4 to 6

        int array3[] = Arrays.copyOfRange(array2, 1, 5);// array3 filled with copy of elements of array2 from index 1 to 5
        Arrays.fill(array3, 3, 4, 16);// array3 elements changed at index 3 to 4 with value 16

        System.out.println("The first mismatched element in array1 and array2 is at position: "+ Arrays.mismatch(array1, array2));
        // find first mismatched term b/w array1 and array2

        System.out.println("The first mismatched element in array2 and array3 is at position: "+ Arrays.mismatch(array3, 0, 4, array2, 1, 6));
        // find first mismatched term b/w array2 (range 1 to 6) and array3 (range 0 to 4)
    }
}
