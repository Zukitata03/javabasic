import java.util.Scanner;
import java.util.Arrays;

class VD5 {   
    
    public static void main(String[] args) {
        int temp,i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        int [] mang = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (i = 0; i < n; i++) {
            mang[i]=sc.nextInt();
        } 
        System.out.println(Arrays.toString(mang));
        for(i=0; i<n; i++)  
       {  
           for(j=i+1; j<n; j++)  
           {  
               if(mang[i] > mang[j])  
               {  
                   temp = mang[i];  
                   mang[i] = mang[j];  
                   mang[j] = temp;  
               }  
           }  
       }               
    System.out.println("Sau khi sap xep mang tang dan: " + Arrays.toString(mang));
    for(i=0; i<n; i++)  
       {  
           for(j=i+1; j<n; j++)  
           {  
               if(mang[i] < mang[j])  
               {  
                   temp = mang[i];  
                   mang[i] = mang[j];  
                   mang[j] = temp;  
               }  
           }  
       }          
    System.out.println("Sau khi sap xep mang tang dan: " + Arrays.toString(mang));
}
}

