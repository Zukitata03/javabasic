import java.util.Scanner;
class Sinhx {
public static double arctan(double x)  {
	double arctanx = x;
	for (int i = 2; i < 50 ; i++) {
	arctanx+= (Math.pow(-1,i-1) * Math.pow(x,2*i-1))/(2*i-1);
	}
	return arctanx;
}
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double x = sc.nextDouble();
 System.out.println(arctan(x) + " " + Math.atan(x));
}	
}