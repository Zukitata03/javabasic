import java.util.Scanner;
class TinhThue {			
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Ban dang song tai bang: ");
	String bang = sc.nextLine();
	System.out.print("Tong tien phai chiu thue la: $");
	double a = sc.nextDouble();
	if  (bang.equals("Wisconsin")) {
	System.out.print("Ban dang song tai quan: ");
	String quan = sc.nextLine();
			if ( quan.equals("Eau Claire")) {
	double tax1 = a*0.05;
	System.out.printf("%s %.2f\n","The tax is: $", tax1);
	double sum = a + tax1;
	System.out.printf("%s %.2f","The total is: $", sum);
			} else if (quan.equals("Dunn")) {
	double tax1 = a*0.04;
	System.out.printf("%s %.2f\n","The tax is: $", tax1);
	double sum = a + tax1;
	System.out.printf("%s %.2f","The total is: $", sum);;
			}	
		} else if (bang.equals("Illinois")) {
	double tax1 = a*0.08;
	System.out.printf("%s %.2f\n","The tax is: $", tax1);
	double sum = a + tax1;
	System.out.printf("%s %.2f","The total is: $", sum);
		}

	
}
}	
		