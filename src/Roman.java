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

    public ArrayList<Integer> createIntArray() {

        char[] array = createRomanArray();

        for (char numeral : array) {
            intArray.add(dict.get(numeral));
        }

        return this.intArray;
    }
}