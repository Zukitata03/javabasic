import java.util.*;
class EqSystem {
	static double mang[] = new double[2];;
	public static double[] solver(double a, double b, double c, double d, double e, double f) {
		double det = ( (a * e) - (d * b) );
		double x = ((c * e) - (b * f))/det;
		double y = ( (a * f) - (d * c) )/det;
/* 		if (det == 0 && x == det && x == y) {
			mang[0] = double.POSITIVE_INFINITY;
			mang[1] = double.POSITIVE_INFINITY;
		} 
		if (det == 0 && (x != 0||y != 0)) {
			mang[0] = double.NaN;
			mang[1] = double.NaN;
		} else if { */
			mang[0] = x;
			mang[1] = y;
		//}
		return mang;
	}	
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		solver(a, b, c, d, e, f);
		for (int i = 0; i < 2; i++) {
            System.out.print(mang[i] + " ");
        }
	}
}





















































