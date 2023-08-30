public class Sin{
    public static final double PI = 3.14159265358979323846;
        

    public static double toRadians(double angdeg) {

        return angdeg / 180.0 * PI;

    }

 

    // x is in radian
    // 1 - x^2/2! + x^4/4! - x^6/6!

    public static double getCos(double x, int precision) {

        double cosOut = 1;

        int n = 2;

        int factorial = 1;

        double power = 1;

        while (n<=precision) {

            power = power * x * x * -1; // note the -1 for the addition flip flop

            factorial = factorial * n * (n-1);

            cosOut = cosOut + (power/factorial);
         n = n + 2;
   }

        return cosOut;
    }

     


    private static void test(double angdeg) {

        double rad = toRadians(angdeg);
        System.out.println("Math.cos = " + Math.cos(rad));

        System.out.println("MyCos   = " + getCos(rad, 8));
        System.out.println();

    }

     

    public static void main(String [] args){

        test(120);

        test(30);

    }

}
