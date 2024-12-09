import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        //int longWord = longWord();
        //int palindrome = palindrome();
        System.out.println("Number of Two Letter Words: " + twoLetter);
       // System.out.println("Number of Tied Longest Words: " + longWord);
        //System.out.println("Number of Palindromes: " + palindrome);*/
        s.close();
    }

    public static int twoLetter() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            if (((s.nextLine()).length()) == 2)
                twoLetter++;
        }
        return twoLetter;
    }
    
    /*public static int longWord() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int palindrome() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigit = 0;
        while (s.hasNext()) {
            if (s.nextInt() >= 10 && s.nextInt() <= 99)
                twoDigit++;
        }
        return twoDigit;
    }*/
}