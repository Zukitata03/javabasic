import java.util.Scanner;
class DoiNhietDo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s \n%s \n%s \n%s ","Nhap lua chon cua ban: ","Nhan C de chuyen tu Fahrenheit sang Celsius ", "Nhan F de chuyen tu Celsius sang Fahrenheit ", "Lua chon cua ban: ");
		String luachon = sc.nextLine();
		System.out.println("Nhap nhiet do ban muon chuyen doi");
		String temp = sc.nextLine();
		boolean check = temp.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		if (luachon.equals("c") || luachon.equals("C") && check) {
			double temp1 = Double.parseDouble(temp);
			double C = (temp1 - 32) * (5/9);
			System.out.printf("%s %.0f %s %s %.0f","Nhiet do tu: " , temp1 , "F" , " sang do C la: " , C);						
		} else if (luachon.equals("f") || luachon.equals("F") && check) {
			double temp1 = Double.parseDouble(temp);
			double F = (temp1 * (9/5)) + 32;
			System.out.printf("%s %.0f %s %s %.0f","Nhiet do tu: " , temp1 , "C" , " sang do F la: " , F);	
		} else { 
			System.out.print("Ban da nhap sai!");
		}
	}
}	