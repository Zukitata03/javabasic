import java.util.Scanner;
public class Collinear {
    public static boolean isCollinear(int[] V, int[] U) {
        int i, t = 0, d1 = 0, d2 = 0;
        for (i = 0; i < V.length; i++) {
            if (V[i] != 0 && U[i] != 0) {
                if (Math.abs(V[i]) >= Math.abs(U[i])) {
                    t = Math.abs(V[i]) / Math.abs(U[i]);
                    break;
                } else {
                    t = Math.abs(U[i]) / Math.abs(V[i]);
                    break;
                }
            }
        }
        for (i = 0; i < V.length; i++) {
            if (Math.abs(V[i] * t) == Math.abs(U[i]))
                d1++;
            else if (Math.abs(U[i] * t) == Math.abs(V[i]))
                d2++;
        }
        if (d1 == V.length || d2 == V.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, i, j, k, t;
        m = scan.nextInt();
        n = scan.nextInt();
        int[][] a = new int[m][n];
        int[] tg1 = new int[m], tg2 = new int[m], kq = new int[n];
        for (i = 0; i < n; i++) {
            kq[i] = i;
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < n-1; i++) {
            for (k = i + 1; k < n; k++) {
                for (j = 0; j < m; j++) {
                    tg1[j] = a[j][i];
                    tg2[j] = a[j][k];
                }
                if (isCollinear(tg1, tg2))
                    kq[k] = kq[i];
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(kq[i] + " ");
        }
    }
}
