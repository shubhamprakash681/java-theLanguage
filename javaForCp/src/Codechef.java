/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner con = new Scanner(System.in);
            int t=con.nextInt();
            while (t-- >0) {
                int n,m,k;
                n = con.nextInt();
                m = con.nextInt();
                k = con.nextInt();
                int ans = 0;
                int[][] a = new int[n][m];
                for (int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        a[i][j] = con.nextInt();
                    }
                }
                int[][] am = new int[n][m];
                for (int i=0; i<n; i++) {
                    am[0][i] = a[0][i];
                }
                for (int i=1; i<m; i++) {
                    for (int j=0; j<n; j++) {
                        am[i][j] = a[i][j] + am[i-1][j];
                    }
                }
                for (int i=0; i<m; i++) {
                    for (int j=1; j<n; j++) {
                        am[i][j] += am[i][j-1];
                    }
                }
                //auxiliarry mat. completed

                int tli, tlj, bri, brj;
                for (tli=0; tli<n; tli++) {
                    for (tlj=0; tlj<m; tlj++) {
                        for (bri=tli, brj=tlj; bri<n && brj<m; bri++, brj++) {
                            double sum = am[bri][brj] - am[tli-1][brj] - am[bri][tlj-1] + am[tli-1][tlj-1];
                            int num = (bri+1 - tli) * (brj+1 - tlj);
                            double avg = sum/num;

                            if (avg >= k) {
                                ans++;
                            }
                        }
                    }
                }
                System.out.println(ans);

                // for (int i=0; i<n; i++) {
                //     for (int j=0; j<m; j++) {
                //         System.out.print(a[i][j]);
                //     }
                //     System.out.println();
                // }
                // System.out.println();
                // for (int i=0; i<n; i++) {
                //     for (int j=0; j<m; j++) {
                //         System.out.print(am[i][j]);
                //     }
                //     System.out.println();
                // }
            }
        }catch (Exception u) {
            return;
        }
    }
}
