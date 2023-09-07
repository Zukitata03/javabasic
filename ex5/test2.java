import java.util.*;
public class test2 {
public static void main(String args[]) {
//Input
  Scanner sc = new Scanner(System.in);
  System.out.println("Nhap so trang web");
  int n = sc.nextInt();
  int link_counts[][] = new int [n][n];
  int outdegree[] = new int [n];
  double [][] T = new double[n][n];
  System.out.println("Nhap cac cap so lien ket giua cac trang web(Nhap mot so bat ki lon hon " + n + " de thoat khoi vong lap.) :");
	while (true) {
		
		int i = sc.nextInt();
		if (i >= n) { 
			break;
		}
		int j = sc.nextInt();
		if (j >= n) { 
			break;
		}
		link_counts[i][j]++;
		outdegree[i]++;
	}
	// Linkcount Matrix
	System.out.println("Ma tran link_counts");
	for (int i = 0; i < n; i++)  {
            for (int j = 0; j < n; j++) { 
                System.out.print(link_counts[i][j] + " "); 
            } 
            System.out.println();
        }
	//Outdegree Matrix
	System.out.println("Ma tran out degree");
		for (int i = 0; i < n; i++)  {
			System.out.println(outdegree[i]);
		}
	//Transistion Matrix
	System.out.println("Ma tran chuyen (Transistion)");
		for (int i = 0; i < n; i++)  {
            for (int j = 0; j < n; j++) {
				T[i][j] = ((0.90*link_counts[i][j])/outdegree[i]) + 0.10/n;
				System.out.printf("%.2f%s",T[i][j] , " ");
			}
			System.out.println();
		}
	//Move how many times?
	System.out.print("Nhap so lan chuyen trang:");
	int m = sc.nextInt();
		double[] rank = new double[n]; 
        rank[0] = 1.0; 
        for (int t = 0; t < m; t++) {
            double[] rank2 = new double[n]; 
            for (int j = 0; j < n; j++) { 
                for (int k = 0; k < n; k++) 
                   rank2[j] += rank[k]*T[k][j]; 
            } 
            rank = rank2;
        }
	System.out.println("Xac suat sau " + m + " lan luot web la:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f%s",rank[i] , " ");
        }
        System.out.println();
}
}
