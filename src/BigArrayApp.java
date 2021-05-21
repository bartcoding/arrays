import java.util.Random;

public class BigArrayApp {


    public static void main(String[] args) {

        int[] bigArray = new int[10];

        fillArray(bigArray);

        printArray(bigArray);

    }

    //fill the array with random numbers between 0 and 9 (9 included)
    public static void fillArray(int[] array){
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(10);
        }

    }

    public static void printArray(int[] array){

        for (int i = 0; i< array.length; i++){

            System.out.println(array[i]);

        }

    }

}
