
public class TicTakToe2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
char [][] board = new char [3][3];
	
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				board[x][y] = '_';
			}
		}
		//how to put pieces on board: put it in this area.
				// board [value][value] = 'x';
		board [1][2] = 'x';
		//note: the first value is columns, the second value is row
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(board[x][y]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}
	