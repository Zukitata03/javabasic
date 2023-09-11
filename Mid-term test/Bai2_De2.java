import java.util.Scanner;
class Bai2_De2 {
	public static double Average(int a[][],int m, int n) {
		int sum3 = 0;
		for (int i = 0; i < n; i++) {
				sum3 += a[2][i];
		}
		double avg = sum3/n;
		return avg;
	}
	public static int findMin(int[][] a) {
	int min = a[2][0];
	for (int i = 0; i < a.length ; i++) {
		if (min > a[2][i]) {
			min = a[2][i];
		}
		}
		return min;
	}	
	public static int printMin (int a[][]) {
				int minin1 = 0;
				for (int j = 0; j < a[0].length; j++ ) {
					if ( findMin(a) == a[2][j] ) {
						minin1 = a[0][j];
					}
				}
		return minin1;
	}
	public static void sort (int a[][]) {
	int temp = 0;
	for (int i = 0; i < a[2].length - 1; i++) {
		if (a[2][i] > a[2][i+1]) {
			temp = a[2][i];
			a[2][i] = a[2][i+1];
			a[2][i+1] = temp;
		}
	}
	System.out.println("Sorted Matrix:");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int sum3 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(Average(a,m,n));
		System.out.println(findMin(a));
		System.out.println(printMin(a));
		sort(a);
	}
}