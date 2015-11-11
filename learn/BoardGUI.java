// TODO import important awt packages
import java.awt.Frame;

// ignore this - "The serialization runtime uses a number (called serialVersionUID)
// to ensure that the object read into the program is compatible with the class
// definition, and not belonging to another version."
@SuppressWarnings("serial")

public class BoardGUI extends Frame{
   // The object Frame should be declared here, in the field

   // TODO constructor to setup the GUI components
   public BoardGUI () {
      // The local variable here terminates at the next squiggly bracket,
      // it does no carry to the main method
      Frame frame = new Frame("This is the title");
      frame.setBackground(Color.white);
      frame.setLayout(null);
      frame.setLocation(0,0);
      frame.setSize(100,100);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      // TODO create a new BoardGUI
      // This doesn't create an instance of the board. I think you are trying to
      // use it as a method, but then we can't change its instance variable.
      BoardGUI();
   }

}
