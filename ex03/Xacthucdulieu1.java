import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
class Xacthucdulieu1 {
	public static void validateInput(String a, String b, String c, String d) {
		int dodaimanv = c.length()*1;
		boolean check1 = a.matches("[A-Za-z].*[A-Za-z]{1,}");
		boolean check2 = b.matches("[A-Za-z].*[A-Za-z]{1,}");
		boolean check3 = d.matches("^[0-9]{1,}$");
		Pattern manv = Pattern.compile("(^[A-Z]{2})([\\w-]{1})(?=[0-9][0-9][0-9][0-9]$)");
		Matcher matcher1 = manv.matcher(c);
		boolean check4 = matcher1.find();
		if (check1) {
			if (check2) {
				if (check3) {
					if (check4) {
						System.out.println("Khong co loi nao tim thay");
					}	
				}
			}	
		}
			if (check1 == false) {
				System.out.println("\"" + a + "\"" + " la ho khong hop le.");
			}
			if (check2 == false) {
				System.out.println("\"" + b + "\"" + " la ten khong hop le."));
			}
			if (check3 == false) {
				System.out.println("ZIP phai la 1 so");;
			}
			if (check4 == false) {
				System.out.println(c + " sai dinh dang ma nhan vien.");
			}			
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho: ");
		String a = sc.nextLine();
		System.out.print("Nhap ten: ");
		String b = sc.nextLine();		
		System.out.print("Nhap ma ZIP: ");
		String d = sc.nextLine();
		System.out.print("Nhap ma nhan vien: ");
		String c = sc.nextLine();		
		validateInput(a,b,c,d);
	}
}	