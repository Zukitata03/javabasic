import java.util.Scanner;
public class TaylorCoshx {
  public static double giaithua(double n)
   {
       double giaithua=1;
       for(double i=2;i<=n;i++)
       {
           giaithua *= i;
       }
       return giaithua;
   }
	  public static double cosh(double x) {
		int n=1000;
       double sum = 0;        
       for(double i=0;i<100;i++)    
       {

           sum += (Math.pow(x,2*i))/giaithua(2*i);

       }
	   return sum;
	  
	  }
      public static void main(String[] args)      
   {

       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap gia tri cua x (0 - 360 do): ");
       double x = sc.nextDouble();
	   x = (x/180)*Math.PI;
		System.out.println("x theo Radians co gia tri la: "+x);
 
       System.out.printf("%s%.4f\n","cosh(x) = ",cosh(x));
	   System.out.printf("%s%.4f\n","sin(x) theo Math.cosh(x) = ", Math.cosh(x));
   }

} 
