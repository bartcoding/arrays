public class BigArrayApp {


    public static void main(String[] args) {

        int[] bigArray = new int[4000];

        bigArray[3999] =8;

        printArray(bigArray);

    }

    public static void fillArray(){




    }

    public static void printArray(int[] array){

        for (int i = 0; i< array.length; i++){

            System.out.println(array[i]);

        }

    }

}
