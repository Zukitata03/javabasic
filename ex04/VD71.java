import java.util.*;
 public class VD71{  
  public static void main(String args[]){  
//tao matran9x9
	int [][] sudoku9x9 = new int[9][9];
//random numbers dien vao mang
	for (int i = 0; i < sudoku9x9.length; i++) {
		for (int j = 0; j < sudoku9x9.length; j ++) {
			// [Math.random()*(max - min) + min] (random tu min den max)
			int number = (int)(Math.random()*(9 - 1 + 1) + 1) ;
		
			sudoku9x9[i][j] =(int)(number + '0');
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
 //@SuppressWarnings("unchecked") 
	private static boolean isValidSudoku(int[][] sudoku9x9) {
/* 		HashSet<String> seen = new HashSet<String>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char val = sudoku9x9[i][j];
					if (!seen.add(val + " thay trong cot " + i) || !seen.add(val + " thay trong hang " + j)
						||!seen.add(val + " thay trong subbox " + i/3 + "-" + j/3)) return true;				
			}
		}
			return true;
} */
	HashSet<Integer> rowDuplicates = new HashSet<>();
    HashSet<Integer> colDuplicates = new HashSet<>();
	boolean isValidSudoku = false;

    for(int i = 0 ; i < sudoku9x9.length; i++)
    {
        for(int j = 0; j < sudoku9x9[i].length; j++)
        {
            if(rowDuplicates.contains(sudoku9x9[i][j]) || colDuplicates.contains(sudoku9x9[j][i]))
            {
                //this board is not valid
                invalidBoard = true;
            }
            else
            {
                rowDuplicates.add(sudoku9x9[i][j]);
                colDuplicates.add(sudoku9x9[j][i]);
            }
        }
//////
        if(colDuplicates.size() == rowDuplicates.size())
        {
            for(int index = 0; index < colDuplicates.size(); index++)
            {
                if(!(colDuplicates.contains(index + 1) && rowDuplicates.contains(index + 1)))
                {
                    invalidBoard = true;
                    break;
                }
            }
        } else {
            invalidBoard = true;    
        }
        colDuplicates.clear();
        rowDuplicates.clear();

    }

    System.out.println("invalid board: " + invalidBoard);		
}
