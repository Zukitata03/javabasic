import java.util.Scanner;
import java.lang.Math;
class TraLaiBank {
	public static double notifyMonthsUntilPaidOff(double a, double b, double c) {
		// a: lai suat theo nam b:so du no c: so tien tra duoc trong mot thang i: lai suat theo ngay
	double d = c/100;
	double i = d/365;
	double e = ( 1 + (b/c) * ( 1 - ( 1 - Math.pow(1+i,30) ) ) );
	double f = 1 + i;
	double result = ((-1/30) * ((Math.log10(e) / Math.log10(f))));
	return result;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap lai suat theo nam: ");
	double a = sc.nextDouble();
	System.out.print("Nhap so du no trong the tin dung: ");
	double b = sc.nextDouble();
	System.out.print("Nhap so tien ban co the tra trong mot thang: ");
	double c = sc.nextDouble();
	System.out.print("Ban mat " + notifyMonthsUntilPaidOff(a,b,c) + " de thanh toan het so du the tin dung.");

	}		
}