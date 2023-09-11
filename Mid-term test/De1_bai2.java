import java.util.Scanner;
class De1_bai2 {
	public static int[] readArray(Scanner reader) {
	int n = reader.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < arr.length; i++ ) {
			arr[i] = reader.nextInt();
		}
		System.out.print("Mang da nhap: " );
		PrintArray(arr);
		System.out.println("Co phai cap so cong voi d la so chan?: " + isEvenArithmetic(arr));
		System.out.println("So lon thu hai trong mang: " + secondMax(arr));
		list2ndMax(arr);
		return arr;
	}
	public static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	System.out.println();	
	}
	public static boolean isEvenArithmetic(int[] arr) {
	double d = 0;
	boolean isEvenArithmetic = false;
	for (int i = 0; i < arr.length - 1; i++) {
		d = arr[1] - arr[0];
		if ( d == (arr[i+1] - arr[i]) && d%2==0)
			isEvenArithmetic = true;
		}
		return isEvenArithmetic;
	}	
	public static int secondMax(int[] arr) {
		int max=0,secmax=0;
/* 		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}					
				}
			} */
	for (int item : arr) {
    if (item > max) {
        secmax = max;
        max = item;
    } else if (item > secmax) {
        secmax = item;
    }
	}	
		return secmax;	
		}
	public static void list2ndMax(int[] arr) {
		int scmax = secondMax(arr);;
		for (int i = 0; i < arr.length; i++) {
			if (scmax == arr[i]) {
				System.out.print(i + " ");;
			}
					
		}
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		readArray(reader);
		}
}