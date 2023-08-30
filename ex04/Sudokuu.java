import java.util.Scanner;

public class Sudokuu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[9][9];
        int[] hang = new int[9], cot = new int[9], ovuong = new int[9];
        int i, j, d = 0, x, y;
        boolean kq = true;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                a[i][j] = (int) (Math.random() * (9 - 1) + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(kq);
        scan.close();
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                hang[j] = a[j][i];
                cot[j] = a[i][j];
            }
            for (x = 0; x < 9; x++) {
                for (y = x + 1; y < 9; y++) {
                    if ((hang[x] == hang[y]) || (cot[x] == cot[y])) {
                        kq = false;
                        break;
                    }
                }
                d = 0;
            }
        }
        System.out.println(kq);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                d = 0;
                for (x = i * 3; x < i * 3 + 3; x++) {
                    for (y = j * 3; y < j * 3 + 3; y++) {
                        ovuong[d] = a[x][y];
                        d++;
                    }
                }
                for (x = 0; x < 9; x++) {
                    for (y = x + 1; y < 9; y++) {
                        if (ovuong[x] == ovuong[y]) {
                            kq = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(kq);
        if (kq == false)
            System.out.println("Mang khong la nghiem dung cua tro choi sudoku");
        else
            System.out.println("Mang la nghiem dung cua tro choi sudoku");
    }
}