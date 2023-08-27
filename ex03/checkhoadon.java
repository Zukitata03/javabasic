import java.util.Scanner;
public class checkhoadon {			
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.print("Tong so loai san pham: ");
		int a = ob.nextInt();
		double sum = 0;
		int b = 0;
		double[] mang1 = new double[a];
		int[] mang2 = new int[a];
		for (int i = 0; i < a; i++) {
				b = i + 1;
				System.out.print("Gia san pham " + b + ":$");
				mang1[i]=ob.nextDouble();
				System.out.print("So luong: ");
				mang2[i]=ob.nextInt();
				double c = mang1[i]*mang2[i];
				sum = sum + c;
			}
			double vat0 = ((5.5/100)*sum);
			double vat = vat0 + sum;
			System.out.println("Tong hoa don chua VAT: $" + sum);
			System.out.println("Tong hoa don co VAT 5.5%: $" + vat);
			System.out.print("VAT 5.5%: $" + vat0); 
		}
}		
				