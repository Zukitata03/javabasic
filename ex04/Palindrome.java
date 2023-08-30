import java.util.Scanner;
class Palindrome
{
    public static boolean isPalindrome(int n)
    {
        String s = String.valueOf(n);
        String r = new StringBuilder(s).reverse().toString();
        if (s.equals(r)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	int n = sc.nextInt();
	if (isPalindrome(n)) {
		System.out.println(n + " la mot so doi xung");
	} else {
		System.out.println(n + " khong phai la mot so doi xung");
    }
	}
}