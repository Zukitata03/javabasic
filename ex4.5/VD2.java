
import java.util.Scanner;
public class VD2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        double [] mang = new double[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            mang[i]=sc.nextDouble();
        }
        int index = 0;
        double min=mang[0];
        for (int j = 0; j < mang.length; j++) {
            if ( mang[j] <= min) {
                min = mang[j];
                index = j;
            }
        }
        System.out.print("Gia tri nho nhat cua mang la " + min + " o vi tri mang[" + index + "]");
        
    }
    
}
