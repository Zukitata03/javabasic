import java.util.Scanner;
class thungson { 
	public static double InOut(double a, double b) {
		double s = a*b;
		int thung = (int) Math.ceil(s/350);
		System.out.print("Dien tich can phong: ");
		System.out.printf("%s%s\n", s," Feet vuong");
		System.out.print("Can so thung son la: " +  thung);
		return s;
		}
		public static void main(String[] args) {
			Scanner ob= new Scanner(System.in);
			System.out.print("Chieu dai can phong theo don vi feet: ");
			double a = ob.nextDouble();
			System.out.print("Chieu rong can phong theo don vi feet: ");
			double b = ob.nextDouble();		
			InOut(a,b);

	}
}
		