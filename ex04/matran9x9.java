import java.util.*;
 public class matran9x9{  
  public static void main(String args[]){  
//tao matran9x9
	char [][] sudoku9x9 = new char[9][9];
//random numbers dien vao mang
	for (int i = 0; i < sudoku9x9.length; i++) {
		for (int j = 0; j < sudoku9x9.length; j ++) {
			// [Math.random()*(max - min) + min] (random tu min den max)
			int number = (int)(Math.random()*(9 - 1 + 1) + 1) ;
		
			sudoku9x9[i][j] =(char)(number + '0');
		}
	} 	
// hien thi bang
	for(int i=0;i < sudoku9x9.length; i++)
    {
        for(int j=0; j < sudoku9x9[i].length; j++) {
        System.out.print(sudoku9x9[i][j]+" ");
    }
		        System.out.println();
	} 
	System.out.println(isValidSudoku(sudoku9x9));
 } 
 @SuppressWarnings("unchecked") 
	private static boolean isValidSudoku(char[][] sudoku9x9) {
		HashSet<String> seen = new HashSet();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char val = sudoku9x9[i][j];
					if (!seen.add(val + " thay trong cot " + i) || !seen.add(val + " thay trong hang " + j)
						||!seen.add(val + " thay trong subbox " + i/3 + "-" + j/3)) return false;				
				}
			}
		}
			return true;
	}
 }