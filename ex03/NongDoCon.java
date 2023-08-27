import java.util.Scanner;
class NongDoCon {
	public static void OnlyNumber(String W, String chai, String nongdo, String H, String gender) {
		boolean check1 = W.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		boolean check2 = chai.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		boolean check3 = nongdo.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		boolean check4 = H.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		
	
	
	if (!check1 || !check2 || !check3 || !check4) {
		System.out.print("Du lieu nhap vao bi sai, vui long nhap lai");
	} else {
	double W1 = Double.parseDouble(chai);
	double chai1 = Integer.parseInt(chai);
	double nongdo1 = Double.parseDouble(nongdo);
	double H1 = Double.parseDouble(H);
	double A1 = chai1*nongdo1;
	double r = 0;	
		if (gender.equals("Nam")) {
		 r = 0.73;
	} else if (gender.equals("Nu")) {
		r = 0.66;
	}
	double BAC = (A1 * 5.14/W1 * r ) - 0.15 * H1;
	if ( BAC >= 0.08 ) {
		System.out.println("Chi so BAC la " + BAC);
		System.out.print("Ban khong duoc phep lai xe!");
	} else if (BAC < 0.08) {
		System.out.println("Chi so BAC la " + BAC);
		System.out.print("Ban duoc phep lai xe");
	}
	}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap can nang cua ban theo pound: ");
		String W = sc.nextLine();
		System.out.print("Nhap gioi tinh (Nam/Nu): ");
		String gender = sc.nextLine();
		System.out.print("Nhap so luong chai con da uong: ");
		String chai = sc.nextLine();
		System.out.print("Nhap nong do con trong dung dich: ");
		String nongdo = sc.nextLine();
		System.out.print("Nhap so gio ke tu lan uong cuoi cung: ");
		String H = sc.nextLine();
		OnlyNumber(W,chai,nongdo,H,gender);
}
}		