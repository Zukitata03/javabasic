import java.util.Scanner;
class PerfectNumber 
{
	public static boolean check(int n) {
		int mark = 0;
		for (int i = 1; i <= n; i++) {
			if ( i * i == n) {
				mark = 1;
			}
		}
	if ( mark == 1) {
		return true;
	} else {
		return false;
	}
	}
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	int n = sc.nextInt();
	if (check(n)) {
		System.out.println(n + " la so cp");
	} else {
		System.out.println(n + " khong phai la so cp");
		}
	}
}