import java.util.Scanner;
class LaiSuat {
	public static double Calculation(double a, double b, double c) {
		b = b/100;
		double d = a*(1+b*c);
		return d;	
	}
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.print("So tien goc theo don vi VND: ");
		double a = ob.nextdouble();
		System.out.print("Lai suat theo nam theo don vi phan tram: ");
		double b = ob.nextDouble();
		System.out.print("So nam gui tiet kiem: ");
		double c = ob.nextDouble();
		System.out.print("Sau " + c + " nam voi lai suat " + b + "%/nam, so tien nhan duoc la " + Calculation(a,b,c) + " VND." );
	}
}	