public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
    String[][] chessBoard = new String[8][8];
    
    String[] pieces1 = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
    // String[] pieces2 = {"Rook", "Knight", "Bishop", "King", "Queen", "Bishop", "Knight", "Rook"};
     
     String[] pawns = {"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn",};
     String[] spaces = {"-", "-", "-", "-", "-", "-", "-", "-",};  
       
       
        chessBoard[0] = pieces1;
        chessBoard[1] = pawns;
        for(int x = 2; x <= 6; x++ )
        {
            chessBoard[x] = spaces;
        }
        chessBoard[6] = pawns;
        chessBoard[7] = pieces1;
         
        print(chessBoard);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}