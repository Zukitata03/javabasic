import java.util.Scanner;
public class ThreeDotThree {
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Nhap tac gia: ");
String author = sc.nextLine();
System.out.print("Nhap cau noi: ");
String speech = sc.nextLine();
System.out.println( author + " Da tung noi rang," + " \" " + speech + " \" " );
}
}