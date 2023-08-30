import java.util.Scanner;
class PrimeNumber 
{
	public static boolean check(int n) {
		int mark = 0;
		for (int i = 2; i < n; i++) {
			if ( n % i == 0) {
				mark = 1;
			}
		}
	if ( mark == 1) {
		return false;
	} else {
		return true;
	}
	}
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	int n = sc.nextInt();
	if (check(n)) {
		System.out.println(n + " la so nguyen to");
	} else {
		System.out.println(n + " khong phai la so nguyen to");
		}
	}
}