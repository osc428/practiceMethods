package veckan9;
/*	// Given an N-by-N grid with each cell either occupied by an 'X', an 'O', or
	// empty, write a function named findLongest that will find the longest
	// sequence of consecutive 'X's either horizontal, vertically, or
	// diagonally. It should print out the (row, column) coordinates of that
	// sequence, along with an indication of whether it is a vertical,
	// horizontal, or diagonal run, and how long the run is.

	// To test your program, write a second function that will create an N-by-N
	// grid of characters, where each cell contains an 'X' or 'O' with
	// probability 1/3. The size N should be a parameter to the function.*/

public class daga_hazirTablo {public static void main(String[] args) {
   char[][] grid = new char['a']['b'];
    printGrid(grid);
    //findLongest(grid);
}

    public static void printGrid(char[][] G) {
        // we print row numbers and column numbers too!
        for (int row = 0; row < G.length; row++) {
            System.out.printf("%3d |", row);
            for (int col = 0; col < G[row].length; col++)
                System.out.print(" " + G[row][col] + " ");
            System.out.println("|");
        }
        System.out.print("    |");
        for (int col = 0; col < G[0].length; col++)
            System.out.print("===");
        System.out.println("|");
        System.out.print("     ");
        for (int col = 0; col < G[0].length; col++)
            System.out.printf(" %2d", col);
        System.out.println();
    }
}


