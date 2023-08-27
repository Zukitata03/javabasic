import java.util.Scanner;
class SucGio {
	public static double Calculation(double a, double b) {
		double c = 35.74 + 0.6215*a + (0.4275*a - 35.75)*Math.pow(b,0.16) ;
	return c;
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Nhiet do theo don vi F: ");
		double a = ob.nextDouble();
		System.out.print("Toc do gio theo don vi miles/gio: ");
		double b = ob.nextDouble();
		if(Math.abs(a)>50 || Math.abs(b)>130 || Math.abs(b)<3){
		System.out.println("Khong the ap dung cong thuc de tinh!");
		} else {
		System.out.printf("%s%.3f","Gia tri suc gio la: ", Calculation(a,b));
		
	}
}
}	