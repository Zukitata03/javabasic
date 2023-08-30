 import java. util. Arrays;
 public class matran9x9{  
  public static void main(String args[]){  
	//tao matran9x9
		int [][] sudoku9x9 = new int[9][9];
	//random numbers dien vao mang
		for (int i = 0; i < sudoku9x9.length; i++) {
			for (int j = 0; j < sudoku9x9.length; j ++) {
				//[Math.random()*(max - min) + min] (random tu min den max)
				sudoku9x9[i][j] = (int)(Math.random()*(9 - 1) + 1);
			}
		}
	//hien thi bang
		for(int i=0;i < sudoku9x9.length; i++)
		{
			for(int j=0; j < sudoku9x9[i].length; j++) {
			System.out.print(sudoku9x9[i][j]+" ");
		}
					System.out.println();
		}
		System.out.println(Check(sudoku9x9));
 } 	
 public static boolean Check(int [][] sudoku9x9) {
	 int[] truelist = {1,2,3,4,5,6,7,8,9};
	 int loop = 0;
	 int count = 0;
	 int[] extraboard = new int[9];
	for(int k = 0; k < 9; k++) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            extraboard[count++] = sudoku9x9[i+3*k/3][j+k%3*3];
        }    
    }
    Arrays.sort(extraboard);
    for(int j = 0; j < 9; j++) {
        if(extraboard[j] == truelist[j])
            loop += 1;
    }
    extraboard = new int[9];
    count = 0;
}
	   if(loop == 81) {
		    return true;
	   } else {
		   return false;
	   }
  }
 }