void main()
{
    int[][] board = new int[3][3];
    int[] aSimpleArray = new int[10];

    //assigning some numbers to the board
    int number = 1;
    for(int row = 0; row < board.length; row++)
    {
        for(int col =0; col < board[row].length; col++)
        {
            //assigning the number to the specific position
            board[row][col] = number;
            number++; //increment the number
        }
    }


    //printing everything in the board
    //for every row
    for(int row = 0; row < board.length; row++)
    {
        //for every row
        for(int col = 0; col < board[row].length; col++)
        {
            //print each on the same line
            System.out.print(board[row][col]);
        }
        //print a new line just before the next column
        System.out.println();
    }
}