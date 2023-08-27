import java.util.Scanner;
class Xacthucmatkhau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matkhau = "admin";
		System.out.print("Nhap nguoi dung: ");
		String user = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		String matkhaunhap = sc.nextLine();
		if (matkhaunhap.equals(matkhau) && user.equals("admin")) {
			System.out.print("Xin chao, Admin." );
		} else {
			System.out.print("Toi khong biet ban.");
		}
	}
}