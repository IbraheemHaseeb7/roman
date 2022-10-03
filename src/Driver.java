public class Driver {
    public static void main(String args[]) {

        // roman object
        Roman test = new Roman();

        // setting value for testing
        test.setRoman("XIV");

        for (int counter = 0; counter < 3; counter++) {
            System.out.println(test.createIntArray().get(counter));
        }
    }
}