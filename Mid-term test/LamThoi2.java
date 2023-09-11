import java.util.*;
public class LamThoi2 {
public static int[] readArray(Scanner sc) {
	int n = sc.nextInt();
	int a[] = new int[n];
	for (int i = 0; i < n; i++) {
	a[i] = sc.nextInt();
	}
	PrintArray(a);
	System.out.println(isEvenArithmetic(a));
	System.out.print(secondMax(a));
	list2ndMax(a);
	return a;
}
public static void PrintArray(int[] a) {
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	readArray(sc);
}
public static boolean isEvenArithmetic(int[] a) {
	boolean dung = false;
	int csc = a[1] - a[0];
	for (int i = 0; i < a.length - 1; i++) {
		if (a[i+1] - a[i] == csc && csc % 2 == 0) {
			return dung = true;
			}
	}
	return dung;
}
public static int secondMax(int[] a) {
	int max = a[0];
	int secmax = a[1];
	for (int i: a) {
		if (i > max) {
			secmax = max;
			max = i;
			} else if (secmax > max) {
				secmax = i;
			}		
	}
	return secmax;
}
public static void list2ndMax(int[] a) {
int b = secondMax(a);
System.out.println();
for (int i = 0; i < a.length; i++) {
	if ( a[i] == b ) {
	System.out.print(i + " ");
		}
	}
}
}