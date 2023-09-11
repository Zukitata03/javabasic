import java.util.Scanner;
public class find2nd {
	public static int secondMax(int b[]) {
		int secmax = -999999;
		int max = -999999;
		for (int item : b) {
		if (item > max) {
			secmax = max;
			max = item;
		} else if (item > secmax) {
			secmax = item;
		}
	}
			return secmax;
}
	public static void tachcot(int a[][]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j] = a[j][i];
			}
			System.out.print(secondMax(b)+ "  ");
		}
	}
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		tachcot(a);
	}
}
