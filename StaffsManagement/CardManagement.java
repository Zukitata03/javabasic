import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardManagement {

	
	public CardManagement()
	{
		super();
	}
	/*
	    Thứ tự nhập như sau:
	    - Số lượng xe
	    - Trong vòng lặp để nhập thông tin mỗi thẻ: nhập số nguyên c = 0 (thẻ học sinh) hoặc 1 (thẻ nhân viên)
	    - Nhập thông tin mỗi thẻ: id, years, day, price, fee (với thẻ sinh viên), và card (với thẻ học sinh)
	*/
	public ArrayList<Card> readData (String fileName)
	{
		File file = new File (fileName);
		Scanner sc = new Scanner(file);
		ArrayList<Card> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = o; i < n; i++) {
			int c = Integer.parseInt(sc.nextLine());
			String id = sc.nextLine();
			int year = Integer.parseInt(sc.nextLine());
			double day = Double.parseDouble((sc.nextLine());
			double price = Double.parseDouble((sc.nextLine());
			if (c == 0) {
				double fee = Double.parseDouble(sc.nextLine());
				StudentCard a = new StudentCard(id, year,day, price, fee);
				list.add(a);
			}	else if (c == 1) {
				double tax = Double.parseDouble(sc.nextLine());
				StaffCard b = new StaffCard(id,year,day, price,tax);
				list.add(b);
			}
		}

		return list;
		
	}
	
	public void printArrayList(ArrayList<Card> cards) {
		for (int i =0;i<cards.size();i++)
			System.out.println(cards.get(i).toString());
	}
	// Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year
	
	public ArrayList<Card> findCards (ArrayList<Card> cards, int year){
		//Begin editable part
		ArrayList<Card> result = new ArrayList<>();
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getYear().equals(year)) {
				result.add(cards.get(i));
			}
		}
		return result;
		//End editable part
	}
	
	// Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
	public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){
		//Begin editable part
		ArrayList<Card> list = new ArrayList<>();
		ArrayList<Card> result = new ArrayList<>();
		double max = Double.MIN_VALUE;
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getClass().getName().equals(typeOfCard)) {
				list.add(cards.get(i));
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAmount() > max) 	{
				max = list.get(i).getAmount();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAmount() == max) {
				result.add(list.get(i).getAmount());
			}
		}
		return result;
		//End editable part
	}

	
	// Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
	public void sortByAmount (ArrayList<Card> cards) {
		//Begin editable part
		for (int i = 0; i < cards.size() - 1; i++) {
			for (int j = i + 1; j < cards.size(); j++) {
				if (cards.get(i).getAmount() < cards.get(j).getAmount() ) {
					Card temp = cards.get(i);
					cards.set(i, cards.get(j));
					cards.set(j, temp);
				}
			}
		}
		//End editable part
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CardManagement cardMng = new CardManagement();
		ArrayList<Card> cards = cardMng.readData("datas.txt");
	}

}
