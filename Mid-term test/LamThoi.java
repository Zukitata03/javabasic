import java.util.*;
class LamThoi {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap x: ");
	double x = sc.nextDouble();
	System.out.print("Nhap n tu -1 den 1: ");
	int n = sc.nextInt();
	System.out.print(arctang(x,n));
	System.out.println(Math.atan(x));
	System.out.println(F(x,n));
}
public static double arctang(double x, int n) {
double sum = x;
	for (int i = 2; i < n; i++) {
		sum += (Math.pow(-1,i-1) * Math.pow(x,2*i-1))/(2*i-1);
	}	
	return sum;
}	
public static double F(double x, int n) {
	double fx = 0;
	fx = x*x*x * arctang(x,n) - 9*x*x + 5;
	return fx;
}	

}