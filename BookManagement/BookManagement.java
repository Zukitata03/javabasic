
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */

	public Book[] readData(Scanner sc) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Book[] a = new Book[n];
	for (int i = 0; i < n; i++) {
		int a = sc.nextInt();
		String id = sc.nextLine();
		int quantity = Integer.parseInt(sc.nextLine());
		String publisher = sc.nextLine();
		double price = Double.parseDouble(sc.nextLine());
	if (a == 1) {
		boolean status = Boolean.parseBoolean(sc.nextLine());
		TextBook txtbook = new ReferenceBook(id, quantity, publisher, price, status);
		a[i] = txtbook;
	} else if(a == 0) {
		double tax = Double.parseDouble(sc.nextLine());
		ReferenceBook rfrbook = new ReferenceBook(id, quantity, publisher, price, tax);
		a[i] = rfrbook;
	}

	}
		return a;
	}
    // In thong tin các cuốn sách
	public void printBooks(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
	}
    // Tìm các cuốn sách của nhà xuất bản publisher
	public ArrayList<Book> findBooks(Book[] books, String publisher) {
		ArrayList<Book> result = new ArrayList<>();
		for (int i = 0; i < books.length; i ++ ) {
			if (books[i].getPublisher().equals(publisher)) {
				result.add(books[i]);
			}
		}
		return result;

	}
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
	public double computeAverage(Book[] books, String typeOfBooks) {
		double sum = 0;
		int d = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getClass().getName().equals(typeOfBooks)) {
				sum += books[i].getAmount();
				d++;
			}
		}
        return sum/d;
	}
    // Sắp xếp các cuốn sách tăng dần về giá tiền
	public void sortByPrice(Book[] books) {

		for (int i=0; i < books.length - 1; i++) {
			for (int j=i+1; j < books.length; j++) {
				if (books[i].getPrice() > books[j].getPrice()) {
					Book temp = books[i];
					books[i] = books[j];
					books [j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	}
}
