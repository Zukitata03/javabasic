import java.util.Scanner;
class SapXep1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap vao 3 so thuc: ");
	System.out.print("a= ");
	double a = sc.nextDouble();
	System.out.print("b= ");
	double b = sc.nextDouble();
	System.out.print("c= ");
	double c = sc.nextDouble();	
	double min, max, mid;
	if( a > b ){
		if( a > c ){
		max = a;
		if( b > c ){
		mid = b;
		min = c;
  } else {
	mid = c;
	min = b;
  }
 } else {
  mid = a;
  max = c;
  min = b;
 }
} else {
 if( b > c ){
  max = b;
  if( a > c ){
   mid = a;
   min = c;
  } else {
   mid = c;
   min = a;
  }
 } else {
  mid = b;
  max = c;
  min = a;
 }
}
	if ( a == b && b == c ) {
	 System.out.println("3 so bang nhau");
	} else {
	System.out.println("Cac so duoc sap xep theo thu tu tang dan: " + min + " " + mid + " " + max);
	}
}
}	