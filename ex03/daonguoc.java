import java.util.Arrays;
import java.util.Scanner;
class daonguoc {
	public static boolean IsAnagram(String tu1, String tu2) {
	tu1 = tu1.toLowerCase();
	tu2 = tu2.toLowerCase();
	if(tu1.length() == tu2.length()) {
		char[] mang1 = tu1.toCharArray();
		char[] mang2 = tu2.toCharArray();
	Arrays.sort(mang1);
	Arrays.sort(mang2);
	boolean bangnhau = Arrays.equals(mang1, mang2);
	if (bangnhau) {
		System.out.println(tu1 + " va " + tu2 + " la anagram ");
		} else {
		System.out.println(tu1 + " va " + tu2 + " khong la anagram ");
		}
	} 
	else {
		System.out.println(tu1 + " va " + tu2 + " khong la anagram ");
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap tu thu nhat: ");
	String tu1 = sc.nextLine();
	System.out.print("Nhap tu thu hai: ");
	String tu2 = sc.nextLine();
	IsAnagram(tu1, tu2);
	}
}	