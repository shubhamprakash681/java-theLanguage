package strings;

import java.util.Scanner;

public class chefAndGroups {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int t = con.nextInt();
//        System.out.println(t);
        con.nextLine();
        while (t-- > 0) {
            String str = con.nextLine();
            int seatPattern = Integer.parseInt(str);
            System.out.println(seatPattern);
//            System.out.println(str);
        }
    }
}
