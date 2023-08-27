public class ThreeDotFiveDotThree {
    public static void main (String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
	double y1 = Double.parseDouble(args[2]);        
        double y2 = Double.parseDouble(args[3]);
        double a = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        System.out.println("Khoang cach giua 2 diem " + "(" + x1 + ", " + y1 + ") va " + "(" + x2 + ", " + y2 + ") la: " + a);
    }
}