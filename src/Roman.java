import java.util.Scanner;

public class Roman {
    private String roman;
    Scanner input;

    {
        this.input = new Scanner(System.in);
    }

    public void takeRoman() {
        this.roman = input.nextLine();
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }

    public String getRoman() {
        return this.roman;
    }

    public char[] createRomanArray() {
        return this.roman.toCharArray();
    }
}