import java.util.Scanner;
public class VD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        int [] mang = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            mang[i]=sc.nextInt();
        }
        int check = 0;
        for (int j = 0; j < n - 1; j++) {
            if ( mang[j] > mang[j+1]) {
                check = 1;
            }
        }
        if (check == 1) {
        System.out.println("Day khong phai la day tang");
        } else {
        System.out.println("Day la day tang");
        }
    }
    
}
