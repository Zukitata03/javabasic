public class LeapYear {
	public static void main(String[] args) {
		int year = Integer.parseInt (args[0]);
		boolean isLeapYear;
	// div by 4
	isLeapYear = (year % 4 == 0);
	// div by 4  and not 100
	isLeapYear = isLeapYear && (year % 100!= 0);
	// div by 4 and not 100 unless divisable by 400
	isLeapYear = isLeapYear || (year % 400 == 0);
	System.out.println(isLeapYear);	
	}
}