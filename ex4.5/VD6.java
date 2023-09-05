import java.util.Scanner;
 public class VD6{  
  public static void main(String args[]){  
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	int n = sc.nextInt();
		int [] a = new int[n+1];
		int [] b = new int[n+1];
		int [] c = new int[n+1];
		for (int i=1; i<n+1; i++) {
			a[i] = i;
			b[i] = i;
			c[i] = a[i] + b[i];
			System.out.println("Phan tu c" + "[" + i + "]" + " = " + "a" + "[" + i + "]" + " + " + "b" + "[" + i + "]" + " = " + c[i]);
		}
	} 
 } 
 