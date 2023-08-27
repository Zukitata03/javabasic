import java.util.Scanner;
class XeOto1 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Is the car silent when you turn the key?");
	String one = sc.nextLine();
	if (!one.equals("y") || !one.equals("n")) {
	System.out.print("ngu");
	}
}
}	