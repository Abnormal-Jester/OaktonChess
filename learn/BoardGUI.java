// TODO import important awt packages
import java.awt.Frame;

// ignore this - "The serialization runtime uses a number (called serialVersionUID)
// to ensure that the object read into the program is compatible with the class
// definition, and not belonging to another version."
@SuppressWarnings("serial")

public class BoardGUI extends Frame{

   // TODO constructor to setup the GUI components
   public BoardGUI () {
      Frame frame = new Frame("This is the title");
      frame.setBackground(Color.white);
      frame.setLayout(null);
      frame.setLocation(0,0);
      frame.setSize(100,100);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      // TODO create a new BoardGUI
      BoardGUI();
   }

}
