
import java.lang.Math;
public class Main {

    public static void main (String[] args) {
      /* TODO */
      double a = Math.PI;
      double b = 0;
      double epsilon = 1e-6;

      int n0 = 2;
      int n = n0;
      double ln = integrate(a, b, n);
      double l2n = 0.0;
      do {
        n = n * 2;
        l2n = ln;
        ln = integrate(a, b, n);
      } while (Math.abs(l2n - ln) >= epsilon);

      System.out.println("Trapezoidal Rule: " + ln);
      System.out.println("Java Library: " + (Math.sin(3 * Math.PI / 2.0) / 3.0));
    }

    public static double f(double x) {
      /* TODO */
      return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }

    static double integrate(double a, double b, int N) {
      double h = (b - a) / N;              // step size
      double sum = 0.5 * (f(a) + f(b));    // area
      for (int i = 1; i < N; i++) {
        double x = a + h * i;
        sum = sum + f(x);
      }

      return sum * h;
    }
  }