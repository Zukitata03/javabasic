
import java.util.Scanner;
import java.util.Arrays;

class VD4 {   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        double [] mang = new double[n];
        double [] mang1 = new double[n-1];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            mang[i]=sc.nextDouble();
        } 
        System.out.println(Arrays.toString(mang));
        for (int j = 0, k = 0; j < n; j++) {
            if (j == 3) { 
                 continue;
            } else 
        mang1[k++] = mang[j];
        
    }
    System.out.println("Sau khi xoa phan tu vi tri thu 3: " + Arrays.toString(mang1));
}
}
