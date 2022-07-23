package strings;
// time complexity = o()
// using ASCII code for each character
import java.util.Scanner;

public class Anagram_m2 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String a = con.next();
        System.out.println("Enter String 2: ");
        String b = con.next();
        int[] aAr = new int[256];
        boolean isAnagram = true;

        if (a.length() == b.length()) {
            for (int i=0; i<a.length(); i++) {
                char ch = a.charAt(i);
                int temp = ch;
                aAr[temp]++;
            }
            for (int i=0; i<b.length(); i++) {
                char ch = b.charAt(i);
                int temp = ch;
                aAr[temp]--;
            }
        }
        else {
            isAnagram = false;
        }
        for (int i=0; i<256; i++) {
            if (aAr[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        }
        else if (!isAnagram ) {
            System.out.println("Not Anagram");
        }
    }
}
