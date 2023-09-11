import java.util.Scanner;
class Find2ndMax {
    public static int max2nd (int[] arr) {
        int kq=-999999;
        int max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] > max)
			max = arr[i];
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] >= kq && arr[i] < max)
			kq = arr[i];
	}
		return kq;
}   
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] col = new int[m];
        int[][] a = new int[m][n];
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                a[i][j]=sc.nextInt();
            }
		}	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				col[j] = a[j][i];
		}
		System.out.print(max2nd(col) + " ");
     } 
}
}