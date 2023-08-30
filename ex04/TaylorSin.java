import java.util.Scanner;
public class TaylorSin
{
   public static double giaithua(int n)
   {
       double giaithua=1;
       for(int i=2;i<=n;i++)
       {
           giaithua *= i;
       }
       return giaithua;
   }
   public static void main(String[] args)      
   {

       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap gia tri cua x (0 - 360 do): ");
       double x = sc.nextDouble();
	   x = (x/180)*Math.PI;
		System.out.println("x theo Radians co gia tri la: "+x);
       int n=100;
       double sum = 0;        
       for(int i=0;i<n;i++)    
       {

           sum += (Math.pow(-1,i)*Math.pow(x,2*i+1))/giaithua(2*i+1);

       }
       System.out.printf("%s%.4f\n","sin(x) = ",sum);
	   System.out.printf("%s%.4f\n","sin(x) theo Math.sin(x) = ", Math.sin(x));
   }

}

