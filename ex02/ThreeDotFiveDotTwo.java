import java.util.Scanner;
public class ThreeDotFiveDotTwo {
public static void main(String[] args)
{
int a = Integer.parseInt (args[0]);
int b = Integer.parseInt (args[1]);
int c = Integer.parseInt (args[2]);
	boolean IsSorted;
if ( a < b && b < c) {
	IsSorted = ( a < b && b < c );
	System.out.print(IsSorted);
} else {
	IsSorted = (a > b && b > c );
	System.out.print(IsSorted);
 
 }
}
}
