import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        int longWord = longWord();
        int palindrome = palindromeCount();
        System.out.println("Number of Two Letter Words: " + twoLetter);
        System.out.println("Number of Tied Longest Words: " + longWord);
        System.out.println("Number of Palindromes: " + palindrome);
        s.close();
    }

    public static int twoLetter() throws FileNotFoundException {
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            if (((line).length()) == 2)
                twoLetter++;
        }
        return twoLetter;
    }

    public static int longWord() throws FileNotFoundException {
        s = new Scanner(f);
        int longest = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            if (line.length() > longest)
                longest = line.length();
        }
        int numLong = 0;
        Scanner d = new Scanner(f);
        while (d.hasNext()) {
            String fine = d.nextLine();
            if (fine.length() == longest) {
                numLong++;
            }
        }
        d.close();
        return numLong;
    }

    public static int palindromeCount() throws FileNotFoundException {
        s = new Scanner(f);
        int palindromes = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            if(isPalindrome(line)) palindromes++;
        }
        return palindromes;
    }

    public static boolean isPalindrome(String word) throws FileNotFoundException {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}