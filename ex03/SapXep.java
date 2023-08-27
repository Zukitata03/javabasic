import java.util.Scanner;
class SapXep {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap vao 3 so thuc: ");
	System.out.print("a= ");
	double a = sc.nextDouble();
	System.out.print("b= ");
	double b = sc.nextDouble();
	System.out.print("c= ");
	double c = sc.nextDouble();	
	if ( a == b && b == c ) {
	 System.out.println("3 so bang nhau");
	} else {
	double min = Math.min(a, Math.min(b, c));
	double max = Math.max( a, Math.max(b,c));
	double mid = a + b + c - min - max;
	System.out.println("Cac so duoc sap xep theo thu tu tang dan: " + min + " " + mid + " " + max);
	}
}
}	