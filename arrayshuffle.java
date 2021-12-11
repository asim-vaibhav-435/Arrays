import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayshuffle {
    public static void main(String[] args) {
        
        Integer array5[] = new Integer[10];// array declaration

        Arrays.setAll(array5, (index)-> index * index);// adding elements in the array 

        System.out.println("Array before shuffle: ");// printing array before shuffle
        for(int n:array5){
            System.out.print(n+" ");
        }

        List<Integer> arraylist = Arrays.asList(array5);// coverting array to list

        Collections.shuffle(arraylist);// performing shuffle operation on list

        arraylist.toArray(array5);// converting shuffled list to array

        System.out.println("\n\nArray after shuffle: ");// printing shuffled array
        for(int n:array5){
            System.out.print(n+" ");
        }
    }
}
