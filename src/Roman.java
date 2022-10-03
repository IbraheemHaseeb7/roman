import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Roman {
    // attributes
    private String roman;
    Scanner input;
    HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
    ArrayList<Integer> intArray = new ArrayList<Integer>();

    // creating scanner to take input from the user
    // adding the dataset for roman numerals
    {
        this.input = new Scanner(System.in);
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
    }

    // to take input from the user if necessory
    public void takeRoman() {
        this.roman = input.nextLine();
    }

    // setter
    public void setRoman(String roman) {
        this.roman = roman;
    }

    // getter
    public String getRoman() {
        return this.roman;
    }

    // converting String into an array of characters
    private char[] createRomanArray() {
        return this.roman.toCharArray();
    }

    // converting char array into integer array
    private ArrayList<Integer> createIntArray() {

        char[] array = createRomanArray();

        for (char numeral : array) {
            intArray.add(dict.get(numeral));
        }

        return this.intArray;
    }

    // returns the final number in decimal form
    public int getNumeric() {
        ArrayList<Integer> array = createIntArray();
        ArrayList<Integer> finalArray = new ArrayList<Integer>();

        for (int counter = 0; counter < array.size() - 1; counter++) {

            if (array.get(counter + 1) > array.get(counter)) {
                int num = array.get(counter + 1) - array.get(counter);
                finalArray.add(num);
                break;
            } else if (counter == array.size() - 2) {
                finalArray.add(array.get(counter + 1));
                finalArray.add(array.get(counter));
                break;
            } else {
                finalArray.add(array.get(counter));
            }

        }

        int sum = 0;

        for (Integer num : finalArray) {
            sum += num;
        }

        return sum;
    }

    // useless function created for some other meaning less logic
    public int createNegativeSum(int counter, ArrayList<Integer> array) {
        int innerCounter = counter;
        int sum = 0;
        do {
            sum = sum + array.get(innerCounter);
            innerCounter--;
        } while (array.get(innerCounter) <= array.get(innerCounter + 1));

        return sum;
    }
}