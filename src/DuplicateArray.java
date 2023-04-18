//import Random
import java.util.Arrays;
import java.util.Random;
public class DuplicateArray {
    public static void main(String[] args) {
        //call Random class to create new object
        Random rand = new Random();
        //initialise arrays 1 and 2
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        // Loop to create 2 different arrays of random number
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            array1[i] = num;
            array2[i] = num2;
        }
        System.out.println("Array 1:" + Arrays.toString(array1));
        System.out.println("Array 2:" + Arrays.toString(array2));
        //Initialise boolean array set to false
        boolean [] dupeBoolean = new boolean [array1.length*array2.length];
        System.out.println("Duplicate values: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                //Compare each value in array 1 to each value in array 2, if they match, mark that number as printed (true), and print the value.
                // The loop checks to see if number is matching and if it has already been printed.
                if (array1[i] == array2[j] && !dupeBoolean[array1[i]-1]) {
                    //Print duplicate value
                    System.out.print(array1[i] + " ");
                    //Mark value as true once printed to avoid printing duplicates
                    dupeBoolean[array1[i]-1] = true;

                    }
                }
            }
        }
    }