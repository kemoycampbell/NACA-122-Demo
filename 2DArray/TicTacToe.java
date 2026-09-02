import java.util.Scanner;

char[][] board = new char[3][3];
char EMPTY_SYMBOL = '_';
char currentPiece = 'X';

//setup the scanner
Scanner reader = new Scanner(System.in);

void main()
{


    //setup the board with all empty symbols
    for(int row = 0; row < board.length; row++)
    {
        for(int col = 0; col < board[row].length; col++)
        {
            //assign every cell as empty
            board[row][col] = EMPTY_SYMBOL;
        }
    }

    //setup a forever loop
    while(true)
    {
        showBoard();
        playPiece();
    }
    
    
}

void playPiece()
{
    //show the user the prompt instruction
    System.out.println("Where would you like to place the piece " + currentPiece);
    System.out.println("It must be in the format row,col. Example:0,0");
    System.out.print("Coordinate:");



    //read what the user select
    String selection = reader.nextLine();
    //break it up into row and col using split which will give us an array
    //first element will be row and second element will be col
    String[] coordinate = selection.split(",");


    //extract out the row and col and convert into string
    int row = Integer.parseInt(coordinate[0]);
    int col = Integer.parseInt(coordinate[1]);

    //validate that the location is empty aka make sure it currently has empty piece
    if(board[row][col]!=EMPTY_SYMBOL){
        System.out.println("You cannot do that, the location is not empty!");
    } else{
        //the location is empty so we can drop the piece there
        board[row][col] = currentPiece;

        //now add the logic to switch the piece between X or O
        if(currentPiece == 'X'){
            currentPiece = 'O';
        } else {
            currentPiece = 'X';
        }
    }

}

void showBoard()
{
    for(int row = 0; row < board.length; row++)
    {
        System.out.print("|");
        for(int col = 0; col < board[row].length; col++)
        {
            //assign every cell as empty
            System.out.print(board[row][col]+"|");
        }
        //print a new line before the next row
        System.out.println();
    }
}