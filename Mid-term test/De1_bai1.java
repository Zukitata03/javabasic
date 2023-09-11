import java.util.Scanner;
class De1_bai1 {
	public static double giaithua(int n) {
		double giaithua = 1;
		for (int i = 2; i <= n; i++) {
			giaithua *= i;
			}
		return giaithua;	
		}
	public static double arctang(double x, int n) {
		double sum = 0;
		for (int i = 1; i < n ; i++) {
			 sum += (Math.pow(-1,i-1)*(Math.pow(x,2*i-1))/giaithua(2*i-1));
			}
			return sum;
		}
	public static double F(double x, int n) {
		double fx = (x*x*x) * arctang(x,n) - 9*x*x + 5;
		return fx;
		}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.printf("%s%.4f\n","arctang(x) = ",arctang(x,n));
		System.out.printf("%s%.4f\n","arctang(x) = ",Math.atan(x));
		System.out.println("f(x) = " + F(x,n));
		}		
	}