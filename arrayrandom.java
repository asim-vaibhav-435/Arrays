import java.util.Random;

public class arrayrandom {

    public static void rand(String fruits[]){

        Random rd = new Random();
        // creating object for random class(inbuilt)

        for(int i = fruits.length - 1; i >= 0; i--){

            int j = rd.nextInt(i+1);// selecting random index using random method to swap elements of the array

        // swap
        String temp = fruits[i];
        fruits[i] = fruits[j];
        fruits[j] = temp;
        }
        
        // print array after shuffling
        System.out.print("\n\nArray after shuffle: ");
        for(String n:fruits){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"grapes", "apples", "mango", "chikoo", "banana", "orange"};
        // array declaration
        
        // print before swap
        System.out.print("Array before shuffle: ");
        for(String m:fruits){
            System.out.print(m+" ");
        }

        rand(fruits);// access rand method to shuffle the array
    }
}
