public abstract class ChessPiece
{
   private int col;
   private int row;
   private int color; //black = 1; white = 0
   
   public boolean moveWouldCauseCheck(int finalRow, int finalCol, ChessBoard board);
   
   public int getCol()
   {
      return col;
   }
   
   public int getRow()
   {
      return row;
   }
      
   public int getColor()
   {
      return color;
   }
   
   public void moveTo(int row, int col);
   
}//ChessPiece  