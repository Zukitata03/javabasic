import java.util.*;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] counts = new int[n][n];    
        int[] outDegree = new int[n];
        while (true) {
            int i = sc.nextInt();
            if (i >= n) break;
            int j = sc.nextInt(); 
            outDegree[i]++; 
            counts[i][j]++;
        } 
	for (int i = 0; i < n; i++)  {
            for (int j = 0; j < n; j++) { 
                System.out.print(counts[i][j] + " "); 
            } 
            System.out.println(); 
        }
        double[][] P = new double[n][n];
        for (int i = 0; i < n; i++)  {
            for (int j = 0; j < n; j++) {
                P[i][j] = 0.90*counts[i][j]/outDegree[i] + 0.10/n; 
                System.out.print(P[i][j] + " "); 
            } 
            System.out.println(); 
        }
	int m = sc.nextInt();   
        double[] rank = new double[n]; 
        rank[0] = 1.0; 
        for (int t = 0; t < m; t++) {
            double[] newRank = new double[n]; 
            for (int j = 0; j < n; j++) { 
                for (int k = 0; k < n; k++) 
                   newRank[j] += rank[k]*P[k][j]; 
            } 
            rank = newRank;
        }
	System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
        System.out.println();
    }
}