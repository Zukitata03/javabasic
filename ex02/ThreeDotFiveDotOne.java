public class ThreeDotFiveDotOne {
public static void main(String[] args)
{
	a = Double.parseDouble(args[0]);
	b = Double.parseDouble(args[1]);
	c = Double.parseDouble(args[2]);
	boolean TheSame;
    TheSame = a.equals(b);
    TheSame = TheSame && b.equals(c);
    System.out.println(TheSame);

}
}
