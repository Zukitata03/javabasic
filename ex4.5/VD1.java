import java.util.Scanner;
class VD1
{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("So phan tu trong mang: ");
	int n = sc.nextInt();
		if (n > 0) {
	checknguyento(n);
		} else {
			System.out.print("Hay nhap n nguyen duong");
		}
}
public static void checknguyento(int n) {
	Scanner sc = new Scanner(System.in);
	int [] mang = new int[n];
	System.out.println("Nhap cac phan tu trong mang:");
	for (int k = 0; k < n; k++) {
			mang[k] = sc.nextInt();
	}
	System.out.print("Cac so nguyen to trong mang:");	
/* 	for (int j = 0; j < n; j++) {
		int mark = 1;
		for (int k = 2; k <= mang[j]; k++) {
			if (mang[j] % k == 0) {
				mark = 0;
			}
		}	
		if (mark == 1) {
			System.out.print(mang[j]+ " ");
		}		
	} */
	for(int i=0;i<n;i++) {
		boolean isPrime =true;
    for(int j=2;j<mang[i];j++) {
        if(mang[i]%j ==0) {
            isPrime =false ;
            break;  
        }
    }
    if(isPrime && mang[i] > 1) {
        System.out.print(mang[i]+" ");
    }
}
}	
}	