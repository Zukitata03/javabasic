import java.util.Scanner;
public class NewMain{
  static boolean badNumber;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do{
      System.out.print("Please print your number: ");
      try{
        int i = sc.nextInt(); 
        System.out.println("Your Number is: " + i);
        badNumber = false;
      }
      catch(Exception e){
        System.out.println("Bad number");
        sc.next();
        badNumber = true;
      }
    }while(badNumber);
  }
}