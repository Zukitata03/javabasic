import java.util.Scanner;
class EuroToDollar {
	public static double Calculation(double a, double b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.print("So Euro muon doi: ");
		double a = ob.nextDouble();
		System.out.println("Ti gia tu Euro sang Dollar: ");
		double b = ob.nextDouble();
		System.out.print(a + " Euro voi ti gia " + b + " bang " + Calculation(a,b) + " Dollar.");
	}
}	