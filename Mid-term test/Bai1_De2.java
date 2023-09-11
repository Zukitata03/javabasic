import java.util.Scanner;
class Bai1_De2 {
public static double[] solver(double a, double b, double c) {
	double mang[] = new double[2];
	double denta;
	denta = Math.pow(b,2) - 4*a*c;
	if (denta < 0 ) {
		mang[0] = Double.NaN;
		mang[1] = mang[0];
		} else if (denta == 0) {
		mang[0] = -b/(2*a);
		mang[1] = mang[0];
		} else {
		mang[0] = (-b + Math.sqrt(denta))/(2*a);
		mang[1] = (-b - Math.sqrt(denta))/(2*a);
		}
	return mang;
	}
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double d[] = solver(a,b,c);
	for (int i = 0; i < d.length;i++) {
		System.out.print(d[i] + " ");
		}
	}
}	