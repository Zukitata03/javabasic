import java.util.Scanner;
class Sinx{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double sum  = x;
		double loop = x;
		for (int i = 1; i < 1000; i++ ) {
			sum*=Math.pow(-1,i)*(x*x)/((2*i+1)*(2*i));
			loop+=sum;
		}
		System.out.print(loop - Math.sin(x));
	}
}