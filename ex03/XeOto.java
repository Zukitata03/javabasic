import java.util.Scanner;
class XeOto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Is the car silent when you turn the key?");
		String one = sc.nextLine();
		if (one.equals("y")) {
			System.out.print("Are the battery terminals corroded?");
			String two = sc.nextLine();
			if (two.equals("y")) {
				System.out.print("Clean terminals and try starting again.");
			} else if (two.equals("n")) {
				System.out.print("Replace cables and try again.");
			}
		} else if (one.equals("n")) {
				System.out.print("Does the car make a clicking noise?");
				String three = sc.nextLine();
				if (three.equals("y")) {
				System.out.print("Replace the battery.");
			} else if (three.equals("n")) {
				System.out.print("Does the car crank up but fail to start?");
				String four = sc.nextLine();
				if (four.equals("y")) {
				System.out.print("Check spark plug connections.");
				} else if (four.equals("n")) {
				System.out.print("Does the engine start and then die?");
					String five = sc.nextLine();
					if (five.equals("y")) {
						System.out.print("Does your car have fuel injection?");
						String six = sc.nextLine();
						if (six.equals("y")) {
						System.out.print("Get it in for service.");
						} else if (six.equals("n")) {
						System.out.print("Check to ensure the choke is opening and closing.");
						}
					}
				}	
			}
		}
	}
}		