package learn;

// TODO import important awt packages
import java.awt.Frame;
import java.awt.Color;

// ignore this - "The serialization runtime uses a number (called serialVersionUID)
// to ensure that the object read into the program is compatible with the class
// definition, and not belonging to another version."
@SuppressWarnings("serial")

public class BoardGUI extends Frame{
   
   public BoardGUI () {
      Frame frame = new Frame("This is the title");
      frame.setBackground(Color.white);
      frame.setLayout(null);
      frame.setLocation(0,0);
      frame.setSize(300,300);
      TextField textfield = new TextField("String", 30);
		textfield.setBackground(Color.gray);
		textfield.setLocation(50, 125);
		textfield.setSize(200, 50);
		frame.add(textfield);
		textfield.setVisible(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      //Created new BoardGUI
      BoardGUI gui = new BoardGUI ();
      
      
   }

}
// 
