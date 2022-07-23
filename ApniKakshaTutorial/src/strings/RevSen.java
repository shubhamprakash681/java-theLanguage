package strings;

import java.util.Scanner;

public class RevSen {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Enter no. of test cases: ");
        int t = con.nextInt();
        con.nextLine();
        while (t-- > 0) {
            System.out.println("Enter a sentence: ");
            String str = con.nextLine();
            System.out.println((revStr(str)));
        }
    }

    static String revStr(String a) {
        String ans = "";
        int i = a.length()-1;
        while (i>=0) {
            while (a.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            while (a.charAt(i) != ' ') {
                i--;
            }
            if (ans.isEmpty()) {
                ans = ans.concat(a.substring(i+1, j+1));
            }
            else {
                ans = ans.concat(" "+ a.subSequence(i+1, j+1));
            }
            if (i<0) {
                break;
            }
        }
        return ans;
    }
}
