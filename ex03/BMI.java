import java.util.Scanner;
class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap can nang cua ban theo pound: ");
		String weight = sc.nextLine();
		System.out.print("Nhap chieu cao cua ban theo inch: ");
		String height = sc.nextLine();
		boolean check1 = weight.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		boolean check2 = height.matches("^[0-9]*[.]*[0-9]*[0-9]*[.]*[0-9]*$");
		double weight1 = Double.parseDouble(weight);
		double height1 = Double.parseDouble(height);
		if (check1 && check2) {			
			double bmi = (weight1/(height1 * height1))*703;
			System.out.printf("%s %.1f \n","Chi so BMI la: ", bmi);	
				if (bmi >= 18.5 && bmi <= 25) {
				System.out.print("Ban co suc khoe binh thuong.");
				} else if (bmi < 18.5) {
				System.out.print("Ban dang bi thieu can. Hay tham van y kien bac si");
				} else if (bmi > 25) {
				System.out.print("Ban dang bi thua can. Hay tham van y kien bac si");
				}
		} else { 
			System.out.print("Ban da nhap sai!");
		}
	}
}	