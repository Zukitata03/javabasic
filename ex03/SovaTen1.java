import java.util.Scanner;
class SovaTen1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap ki tu x bat ky: ");
	String x = sc.nextLine();
	boolean check = x.matches("^[0-9]{1,}$");
	boolean check2 = x.matches("^[A-Za-z]{1,}$");
	int result = 0;
	if (check) {
		result = 1;
	} else if (check2) {
		result = 2;
	} else {
		result = 3;
	}
	switch (result) {
		case 1:
		System.out.print(x + " la mot so.");
		break;
		case 2:
		System.out.print(x + " la mot chu.");
		break;
		case 3:
		System.out.print(x + " la mot ki tu dac biet.");
		break;
	}	
	}
}	