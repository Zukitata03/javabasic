import java.util.Scanner;
public class dientich {
	public static void Input(double a, double b) {
		double sf = (a * b);
		double sm = (sf * 0.09290304);
		Output(sf,sm);
}
	public static void Output(double sf, double sm) {
		System.out.print("Dien tich can phong: ");
		System.out.printf("%s%s\n%.2f%s", sf," Feet vuong", sm, " Met vuong");
}
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.print("Chieu dai can phong theo don vi feet: ");
		double a = ob.nextDouble();
		System.out.print("Chieu rong can phong theo don vi feet: ");
		double b = ob.nextDouble();		
		Input(a,b);
}
}
