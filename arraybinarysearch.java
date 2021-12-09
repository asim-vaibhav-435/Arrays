import java.util.Arrays;
import java.util.Scanner;

public class arraybinarysearch {

    public static int arr3[] = {18, 36, 54, 72, 90, 108, 126};// initialize array
    public static int item, start, end, flag = 1;// variable declaration

    public static Scanner key = new Scanner(System.in);// declaring scanner class globally

    public static void result(int flag, int choice){  //method to display reuslt according to condition
        if(flag == 0 && choice == 1){
            System.out.println("The array binary search, \n The element Found at position: " + Arrays.binarySearch( arr3, item));
        }
        else if(flag == 0 && choice == 2){
            System.out.println("The array binary search, \n The element Found at position: " + Arrays.binarySearch(arr3, start, end, item));
        }
        else{
            System.out.println("The array binary search, \n The element NOT FOUND!");
        }
    }
    
    public static int opt1(int item){  //binary search in array without range
        for(int i=0; i < arr3.length; i++) {

            if(Arrays.binarySearch( arr3, item) == i){
               flag = 0;
               break;
            }
        }
        return flag;
    }

    public static int opt2(int item){  //binary search in array within a range

        System.out.println("Enter the start and end range: ");
        int start = key.nextInt(); 
        int end = key.nextInt();
        for(int i=start; i <= end; i++) {

            if(Arrays.binarySearch(arr3, start, end, item) != i){
               flag = 0;
               break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        
        System.out.print("Enter the element: ");
        item = key.nextInt(); 

        System.out.print("1.Binary Search \n2. Binary search with range \n Enter your choice: ");//switch case to choose a method
        int choice = key.nextInt();

        switch (choice) {
            case 1: opt1(item); //choice for binary search without range
                    result(flag, choice);               
                break;
            case 2: opt2(item); //choice for binary search within a specific range
                    result(flag, choice);               
                break;
        
            default: System.out.println("Enter proper choice!");
                break;
        }
       
        key.close(); 
    }    
}
