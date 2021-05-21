public class MultiDimensionArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,100,10,12};
        int[] otherNumbers = {5,8,13,1};
        int[] evenMoreNumbers = {1,-3,-8,6};

        //different kinds of creating the array
        //int[][] arrayOfNumberArrays= {numbers,otherNumbers,evenMoreNumbers};

        //arrayOfNumberArrays = new int[][]{numbers,otherNumbers,evenMoreNumbers};
        int[][] arrayOfNumberArrays;
        arrayOfNumberArrays = new int[3][];
        arrayOfNumberArrays[0] = numbers;
        arrayOfNumberArrays[1] = otherNumbers;
        arrayOfNumberArrays[2] = evenMoreNumbers;


        //i want to print the second number of the first array
        System.out.println(arrayOfNumberArrays[0][1]);
        //i want to print the third number of the third array
        System.out.println(arrayOfNumberArrays[2][2]);



    }

}
