public class Pawn extends ChessPiece
{
   private String color;
   private boolean hasMoved;
   private int column, row;
   private static int whiteCounter = 0, blackCounter = 0;

   Pawn (String color) 
   {
      this.color = color;
      hasMoved = false;
      if (color.equals("white")) // assumes bottom half of chess board is white
      {
         row = 2;
         column = ++whiteCounter;
      }
      else
      {
         row = 7;
         column = ++blackCounter;
      }
   }
   
   public String returnColor()
   {
      return color;
   }
   
   public boolean returnHasMoved()
   {
      return hasMoved;
   }
   
   public int returnRow()
   {
      return row;
   }
   
   public int returnColumn()
   {
      return column;
   }
   
   @Override
   public String toString() 
   {
      return "Color: " + color +
             "\nLocation: (" + row + ", " + column + ')' +
             "\nMoved: " + hasMoved;
   }

   public static void main(String[] args) 
   {
      Pawn white1 = new Pawn("white");
      System.out.println(white1);
      Pawn white2 = new Pawn("white");
      System.out.println(white2);
      Pawn black1 = new Pawn("black");
      System.out.println(black1);
      Pawn black2 = new Pawn("black");
      System.out.println(black2);
      // current output
      /*
      White Pawn 1
      Color: white
      Location: (2, 1)
      Moved: false
      White Pawn 2
      Color: white
      Location: (2, 2)
      Moved: false
      Black Pawn 1
      Color: black
      Location: (7, 1)
      Moved: false
      Black Pawn 2
      Color: black
      Location: (7, 2)
      Moved: false
      */
      
   }
}
