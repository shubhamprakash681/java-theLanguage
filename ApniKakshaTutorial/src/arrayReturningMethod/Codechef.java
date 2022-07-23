package arrayReturningMethod;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int t = con.nextInt();
        while (t-- > 0) {
            int r = con.nextInt();
            int c = con.nextInt();
            int x = con.nextInt();
            con.nextLine();

            MyMattrix m1 = new MyMattrix();
            int[][] a = m1.createMatrix(r, c);
            int[][] b = m1.createMatrix(r,c);
            MyMattrix.displayMatrix(a,r,c);
            MyMattrix.displayMatrix(b,r,c);
        }
    }
}


class MyMattrix {
    static int[][] createMatrix(int r, int c) {
        Scanner con = new Scanner(System.in);
        int[][] mat = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                mat[i][j] = con.nextInt();
            }
        }
        return mat;
    }

    static void displayMatrix(int[][] mat, int r, int c) {
        for (int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}