public class StringArrayApp {


    public static void main(String[] args) {

        //declare a string[] variable stringArray
        String [] stringArray;

        //create string array
        //make stringArray variable point to this array
        //array should have the elements "mercury", "venus", "earth", "mars", "saturn", "jupiter", "uranus", "neptune"

        stringArray = new String[]{"mercury", "venus", "earth", "mars", "saturn", "jupiter", "uranus", "neptune"};

        for (String planet:stringArray) {
            System.out.println("hello " + planet);
        }

    }
}
