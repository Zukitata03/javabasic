/** Class EduCenter: 
 * Lớp dùng để gọi thực hiện và kiểm thử các lớp đã xây dựng trước đó. 
 * Cần hoàn thiện các phương thức chưa đầy đủ nhưng phải giữ nguyên mẫu
 * phương thức (khai báo, đối số, kiểu trả về). Có thể thay đổi giá trị 
 * sau lệnh return cuối các phương thức nhưng cần giữ nguyên kiểu trả về. 
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */


import java.util.Scanner;
import java.util.ArrayList;

public class EduCenter{
    public static int currentYear = 2020;
    public static double baseAmount;

    public static Person[] readData(Scanner scan){
        // bổ sung mã lệnh. Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        // cái dòng 0 với 2020 nó tự tạo chứ ko sai chỗ đấy đau
        // Thế cái code ô đọc nó bắt đầu từ đâu

        int n = scan.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String code = scan.nextLine();
            String name = scan.nextLine();
            // Sai xong split ra nhét từng cái vào mà ko đc
            // để t thử xem
            String[] date = scan.nextLine().split(" ");
            Integer d = Integer.parseInt(date[0]);
            System.out.print(date[0]);
            //cái này ko cho xem in đâu, cop vào ide chạy mới biết đc, chỉ bin luôn dùng cái intelij ik
            Integer m = Integer.parseInt(date[1]);
            Integer y = Integer.parseInt(date[2]);

            boolean gender = Boolean.parseBoolean(scan.nextLine());
            String email = scan.nextLine();
            String address = scan.nextLine();
            Date date1 = new Date(d,m,y);
            if (code.charAt(0) == '1') {
                double score = Double.parseDouble(scan.nextLine());
                String major = scan.nextLine();
                Student studentList = new Student(code, email, major, score , name, date1, gender, address);
                persons[i] = studentList;
            } else {
                String department = scan.nextLine();
                double salary = Double.parseDouble(scan.nextLine());
                String[] date2 = scan.nextLine().split(" ");
                Integer d1 = Integer.parseInt(date2[0]);
                Integer m1 = Integer.parseInt(date2[1]);
                Integer y1 = Integer.parseInt(date2[2]);
                Date recruitment = new Date(d1,m1,y1);
                Staff staffList = new Staff(code, email, department, salary, recruitment, name, date1, gender, address);
                persons[i] = staffList;
            }
        }
        try{
            // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
            // nhưng không thay đổi kiểu trả về!
            // Thứ tự dữ liệu nhập: Đọc và thực hiện đúng theo yêu cầu như trong mô tả
        } catch(ArithmeticException ArtmExcp){
            System.out.print(ArtmExcp.getMessage() );
            return null;
        } catch(Exception Excp){
            System.out.println("Data types mismatch!");
            return null;
        }
        // cái ngày tháng năm nó nhâp vd là 15 05 2003, tôi thử split ra cũng méo đc

        // Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return persons;
    }

    public static ArrayList<Person> listOfStaff(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        for (int i = 0; i < listPerson.length; i++) {
            if (listPerson[i].getClass().getSimpleName().equals("Staff")) {
                results.add(listPerson[i]);
            }
        }
        if ( results.size() > 0)
            return results;
        else
            return null;
    }

    public static void sortStaffBySalary(ArrayList<Person> listStaff){
        Staff tmp;
        int n = listStaff.size();
        Staff staffI, staffJ;
        for (int i = 0; i < n-1; i ++) {
            for(int j = i + 1; j < n; j++){
                staffI = (Staff)listStaff.get(i);
                staffJ = (Staff)listStaff.get(j);
                if(staffI.getSalary() > staffJ.getSalary()){
                    tmp = (Staff)listStaff.get(i);
                    listStaff.set(i, listStaff.get(j) );
                    listStaff.set(j, tmp);
                }
            }
        }
    }

    public static void sortStudentByScore(ArrayList<Person> listStudent){
        // bổ sung mã lệnh ở đây! Không thay đổi khai báo phương thức!
        // Tham khảo phương thức sortStaffBySalary
        Student temp;
        Student st1, st2;
        for (int i = 0; i < listStudent.size() - 1; i++ ) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                st1 = (Student)listStudent.get(i);
                st2 = (Student)listStudent.get(j);
                if (st1.getScore() > st2.getScore()) {
                    temp = (Student)listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j,temp);
                }
            }
        }
    }

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        for (int i = 0; i < listPerson.length; i++) {
            if (listPerson[i].getClass().getSimpleName().equals("Student")) {
                results.add(listPerson[i]);
            }
        }

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        if(results.size() > 0)
            return results;
        else
            return null;
    }

    public static Person searchByCode(Person[] listPerson, String code){
        for (int i = 0; i < listPerson.length; i++ ) {
            if (listPerson[i].getCode().equals(code)) {
                return (listPerson[i]);
            }
        }
        return null;
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả v

    }
    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson){
        if(listPerson != null){

            System.out.println(listPerson.toString());

        } else{
            System.out.println("No any person in this list!");
        }
    }

    // Phương thức theo yêu cầu ở mục 4.3 trong mô tả
    public static void displayList(ArrayList<Person>  listPerson){
        // Bổ sung mã lệnh để phương thức này có thể thông tin ra màn hình đúng theo mẫu
        // cả trường hợp Student và Staff
        int n = listPerson.size();
        if(n > 0){

            for (int i = 0; i < n; i ++){
                if(listPerson.get(i).getClass().getSimpleName().equals("Staff")){
                    /* Đặt staff = (Staff)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)) */
                    Staff staff = (Staff) listPerson.get(i);
                    System.out.println(staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)));
                }else{
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;

                    Student student = (Student) listPerson.get(i);
                    System.out.println(student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ));
                }
            }
        } else{
            System.out.println("No any person in this list!");
        }
    }


    public static void sortByLastName(Person[] listPerson){
        // Bổ sung mã lệnh để phương thức này có thể sắp xếp mảng theo thứ tự tăng dần
        // của phần tên LastName (từ cuối cùng của tên đầy đủ) các đối tượng Person
        // Dùng phương thức lớp String: str1.compareTo(String str2) để so hai xâu str1 và str2.
        for (int i = 0; i < listPerson.length - 1 ; i++) {
            for (int j = i + 1; j < listPerson.length ; j++) {
                String str1 = listPerson[i].getLastName();
                String str2 = listPerson[j].getLastName();
                if (str1.compareTo(str2) > 0) {
                    Person temp = listPerson[i];
                    listPerson[i] = listPerson[j];
                    listPerson[j] = temp;
                }
            }
        }
    }// tôi không biết vứt vào ide kiểu gì

    public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){
        // bổ sung mã lệnh ở đây để liệt kê các đối tượng Student trong listPerson có trường majors
        // trùng với tham đối majors! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        ArrayList<Person> result = new ArrayList<>();
        ArrayList<Person> list = new ArrayList<>();
        if (listPerson != null) {
            for (int i = 0; i < listPerson.length; i ++){
                if(listPerson[i].getClass().getSimpleName().equals("Student")){
                    result.add(listPerson[i]);

                }
            }
            for (int i = 0; i < result.size(); i++) {
                Student st1 = (Student) result.get(i);
                if (st1.getMajors().equals(majors)) {
                    list.add(st1);
                }
            }
            return list;
        } else {
            return null;
        }
    }

    public static void main(String Ag[]){
        Scanner scan = new Scanner(System.in);
        currentYear = scan.nextInt();
        // Chỉ cần viết main để kiểm thử theo ý người lập trình
        // Phần chạy thử & chấm trên hệ thống đã có lớp khác.
    }

}