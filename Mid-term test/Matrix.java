import java.util.*;
public class Matrix {
	public static int[][] GetArray(int[][] mang, int m, int n) {
		System.out.println("Ma tran:");
		for (int i = 0; i < mang.length; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(mang[i][j] + " ");			
		}
			System.out.println();
	}
	return mang;
	}	
	public static double Avg(int[][] mang,int m, int n) {
		double avg = 0;
		double sum = 0;
		for(int i = 0; i < mang.length; i++) {
			 sum = sum + mang[i][1];
		}
		avg = sum/m;
		return avg;
	}
	public static int findMax(int[][] mang, int m, int n) {
	int max = mang[0][1];
	for (int i = 0; i < mang.length; i++) {
		if (max < mang[i][1]) 
			max = mang[i][1];
		
	}
	return max;
	}
	public static void printMax(int[][] mang, int m, int n) {
	int maxIndex = 0;
	System.out.print("Gia tri o cot 1: " );
	for (int i = 0; i < mang.length; i++) {
		if (findMax(mang, m, n) == mang[i][1]) {
			maxIndex = i;
			System.out.print(mang[i][0]+ " ");
		}		
	}
	System.out.println();
	}
	public static void sort(int [][] mang, int m, int n) {
	System.out.println("Ma tran da sap xep: ");
	int temp;
	for (int i = 1; i<mang.length; i++) {
		int chiso = i;
			for (int j = i - 1; j >= 0; j--, chiso--) {
				if(mang[j][1] > mang[chiso][1]) {
					for (int k = 0; k < mang[j].length; k++) {
						temp = mang[j][k];
						mang[j][k] = mang[chiso][k];
						mang[chiso][k] = temp;
						
					}
				}	
			}
	}
	for (int i = 0; i < mang.length; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(mang[i][j] + " ");			
		}
			System.out.println();
	}
	
}		
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int mang[][] = new int[m][n];
	for (int i = 0; i < mang.length; i++) {
		for (int j = 0; j < n; j++) {
			mang[i][j] = sc.nextInt();
		}
	}	
	GetArray(mang,m,n);
	System.out.printf("%s%.2f\n", "Trung binh cong cua cot thu 2: ", Avg(mang,m,n));
	System.out.println("Gia tri lon nhat trong cot thu 2: " + findMax(mang,m,n));
	printMax(mang, m, n);
	sort(mang, m, n);
		}
	}