public class ThreeDotFiveDotFive {
public static void main(String[] args)
{
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double min = Math.min(a, Math.min(b, c));
	double max = Math.max( a, Math.max(b,c));
	double mid = a + b + c - min - max;
	System.out.println(min + " " + mid + " " + max);

}
}
