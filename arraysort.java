import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class arraysort {
    public static void main(String[] args) {
        Integer arrayint[] = { 96, 72, 46, 48, 43, 49, 65, 23, 99,21, 14, 64, 65, 25, 54, 61, 22, 15, 69};// initialize a array

        Stream<Integer> s2 = Arrays.stream(arrayint);// display initial array to the user
        System.out.println("Array before sorting: ");
        s2.forEach((b)-> System.out.print(b+" "));

        Arrays.sort(arrayint);// sorts the full array
        System.out.println("\n\nArray after sorting: ");
        for(int n:arrayint){
            System.out.print(n + " ");
        }

        Arrays.sort(arrayint, 2, 10);// sorts from index 2 to 10 only
        System.out.println("\n\nArray after sorting in range 2 to 10: ");
        for(int n:arrayint){
            System.out.print(n + " ");
        }

        Arrays.parallelSort(arrayint);// sorting using parallel sort method
        System.out.println("\n\n Array after parallel sort: ");
        for(int n:arrayint){
            System.out.print(n + " ");
        }

        List<Integer> itk = Arrays.asList(arrayint);// display array as list
        System.out.print("\n\nArray as List: \n" + itk);
    }
}
