import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverterUtilizer {
	static BinaryConverter obj0 = new BinaryConverter();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField answer = new JTextField(20);
	static JButton button = new JButton();
	
	public static void main(String args[]) {
		new BinaryConverterUtilizer().setUp();
		System.out.println(obj0.convert("01010010") + obj0.convert("01000101") + obj0.convert("01010101") + obj0.convert("01000010") + obj0.convert("01000101") + obj0.convert("01001110"));
		System.out.print(obj0.convert("01000100") + obj0.convert("01000001") + obj0.convert("01001110") + obj0.convert("01001001") + obj0.convert("01000101") + obj0.convert("01001100"));
	}
	
	public void setUp() {
		frame.add(panel);
		panel.add(button);
		button.addMouseListener(this);
		button.setText("Convert");
		answer.setText("Enter 8-bit Binary");
	}
}