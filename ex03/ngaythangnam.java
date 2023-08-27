import java.util.Scanner;
public class ngaythangnam {
	public static void Tinhtoan(int m, int d, int y) 
	{
		int y0, x, m0,d1;
		//int d1 = 0;
			switch (m) {
			case 1: case 3 : case 5: case 7 : case 8 : case 10 : case 12:
						if (d < 32 && d > 0 && y > 0) {
							y0 = y - (14 - m)/12;
							 x = y0 + (y0/4) - (y0/100) + (y0/400);
							 m0 = m + 12 * ((14 - m)/12) - 2;
							 d1 = (d + x + (31*m0)/12) % 7 ;
					switch (d1) {
					case 0:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Chu Nhat");
						break;
					case 1:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Hai");
						break;
					case 2:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Ba");
						break;
					case 3:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Tu");
						break;
					case 4:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Nam");
						break;
					case 5:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Sau");
						break;
					case 6:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Bay");
						break;
					default:
						break;
																		}
						} else {
							System.out.print("Thong tin khong chinh xac! Vui long nhap lai");
							break;
						}
						break;
			case 2:
						if ((y > 0) && (y % 4 == 0) && !(y % 100 == 0) || (y % 400 == 0)) {
							if (( d < 30 && d > 0 )) {
							 y0 = y - (14 - m)/12;
							 x = y0 + (y0/4) - (y0/100) + (y0/400);
							 m0 = m + 12 * ((14 - m)/12) - 2;
							 d1 = (d + x + (31*m0)/12) % 7 ;
							 				switch (d1) {
					case 0:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Chu Nhat");
						break;
					case 1:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Hai");
						break;
					case 2:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Ba");
						break;
					case 3:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Tu");
						break;
					case 4:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Nam");
						break;
					case 5:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Sau");
						break;
					case 6:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Bay");
						break;
					default:
						break;
				}
							 break;
							} else {
							System.out.print("Thong tin khong chinh xac! Vui long nhap lai!");
							break;
						}
						} else if ((d <29 && d>1 && y > 0)) {
							 y0 = y - (14 - m)/12;
							 x = y0 + (y0/4) - (y0/100) + (y0/400);
							 m0 = m + 12 * ((14 - m)/12) - 2;
							 d1 = (d + x + (31*m0)/12) % 7 ;
							 				switch (d1) {
					case 0:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " +  y +" la Chu Nhat");
						break;
					case 1:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Hai");
						break;
					case 2:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " +  y +" la Thu Ba");
						break;
					case 3:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Tu");
						break;
					case 4:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Nam");
						break;
					case 5:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Sau");
						break;
					case 6:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Bay");
						break;
					default:
						break;
				}
							 break;
					
						} else {
							System.out.print("Thong tin khong chinh xac! Vui long nhap lai Ngay!");
							break;
						}
					case 4 : case 6 : case 9: case 11:
						if (d < 31 && d > 0 && y > 0) {
							 y0 = y - (14 - m)/12;
							 x = y0 + (y0/4) - (y0/100) + (y0/400);
							 m0 = m + 12 * ((14 - m)/12) - 2;
							 d1 = (d + x + (31*m0)/12) % 7 ;
							 				switch (d1) {
					case 0:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Chu Nhat");
						break;
					case 1:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " +  y +" la Thu Hai");
						break;
					case 2:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Ba");
						break;
					case 3:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Tu");
						break;
					case 4:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Nam");
						break;
					case 5:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Sau");
						break;
					case 6:
						System.out.print("Ngay " + d + " Thang " + m + " Nam " + y + " la Thu Bay");
						break;
					default:
						break;
				}
							 break;
						} else {
							System.out.print("Thong tin khong chinh xac! Vui long nhap lai Ngay");
							break;
						}
					default:
						System.out.println("Thong tin khong chinh xac! Vui long nhap lai Thang");
						break;
				}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thang: ");
		int m = sc.nextInt();
		System.out.print("Nhap ngay: ");
		int d = sc.nextInt();	
		System.out.print("Nhap nam: ");
		int y = sc.nextInt();
		Tinhtoan(m, d, y);

				
	}
}
	
	
	