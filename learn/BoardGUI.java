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
	Frame frame = new Frame("Frame Title");
	frame.setBackground(Color.white);
	frame.setLayout(null);
	frame.setLocation(0, 0);
	frame.setSize(300, 300);
	TextField textfield = new TextField("0", 30);
	textfield.setBackground(Color.gray);
	textfield.setForeground(Color.white);
	textfield.setLocation(50, 125);
	textfield.setSize(200, 50);
	textfield.setEditable(false);
	Button countButton = new Button("tap me");
	countButton.setLocation(100, 190);
	countButton.setSize(100, 44);
	countButton.setForeground(Color.blue);
	countButton.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			int current = Integer.parseInt(textfield.getText());
			textfield.setText(String.valueOf(current + 1));
		}
	});
	Button exitButton = new Button("Exit");
	exitButton.setLocation(100, 245);
	exitButton.setSize(100, 44);
	exitButton.setForeground(Color.blue);
	exitButton.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	frame.add(exitButton);
	frame.add(textfield);
	frame.add(countButton);
	textfield.setVisible(true);
	frame.setVisible(true);
   }

   public static void main(String[] args) {
      //Created new BoardGUI
      BoardGUI gui = new BoardGUI ();
      
      
   }

}
// 
