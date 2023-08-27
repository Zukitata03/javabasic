import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
class TestPassword {
	public static void passwordValidator(String p) {
	int dodai = p.length()*1;
	boolean check1 = p.matches("[0-9]+");
	boolean check2 = p.matches(".*[a-z].*");
	Pattern pattern2 = Pattern.compile("^(?=.*[0-9].*)(?=.*[a-z].*).*$");
	Pattern pattern1 = Pattern.compile(".*[a-z]*.*[!@#$&*]{1,}.*");
	Matcher matcher1 = pattern1.matcher(p);
	Matcher matcher2 = pattern2.matcher(p);
	boolean KiTuDacBiet = matcher1.find();
	boolean check3 = matcher2.find();
	if (dodai < 8) {
		if ( check1 ) {
			System.out.println("Mat khau rat yeu!");
		} else if ( check2 ) {
			System.out.println("Mat khau yeu!");
		}
	} else if (dodai >= 8 ) {
		if (KiTuDacBiet && check3) {
			System.out.println("Mat khau rat an toan");
		}
		else if (KiTuDacBiet || check3) { 
			System.out.println("Mat khau an toan");
		} else {
			System.out.println("Mat khau yeu");
		}
	}		
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap pass de kiem tra : ");
		String p = sc.nextLine();
		passwordValidator(p);
	}
}














