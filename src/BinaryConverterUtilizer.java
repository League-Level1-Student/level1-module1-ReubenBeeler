import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverterUtilizer implements ActionListener {
	static BinaryConverter obj0 = new BinaryConverter();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField answer = new JTextField(20);
	static JButton button = new JButton();
	static JLabel label = new JLabel();

	public static void main(String args[]) {
		new BinaryConverterUtilizer().setUp();
		
		System.out.println(obj0.convert("01010010") + obj0.convert("01000101") + obj0.convert("01010101") + obj0.convert("01000010") + obj0.convert("01000101") + obj0.convert("01001110"));
		System.out.print(obj0.convert("01000100") + obj0.convert("01000001") + obj0.convert("01001110") + obj0.convert("01001001") + obj0.convert("01000101") + obj0.convert("01001100"));
	}
	
	public void setUp() {
		frame.add(panel);
		frame.setTitle("8-bit Binary to ASCII Converter");
		panel.add(button);
		panel.add(answer);
		panel.add(label);
		button.addActionListener(this);
		button.setText("Convert");
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public String binaryToDecimal(String input) {
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         	return "";
        } else {
             int count = 0;
             int power = 1;
             for (int i = input.length() - 1; i >= 0; i--) {
            	 	if (input.charAt(i) == '1') {
            	 		count +=  power;
            	 	}
            	 		power = power * 2;
             }
             return String.valueOf(count);
        }
	}
	
	public String binaryToHexidecimal(String input) {
		String Hexidecimal = "";
		int decimal = Integer.parseInt(binaryToDecimal(input));
		if (decimal == 0) {
			return "";
		} else {
			while (decimal != 0) {
				if (decimal % 16 < 10) {
					Hexidecimal += decimal % 16;
				} else if (decimal % 16 == 10) {
					Hexidecimal += "a";
				} else if (decimal % 16 == 11) {
					Hexidecimal += "b";
				} else if (decimal % 16 == 12) {
					Hexidecimal += "c";
				} else if (decimal % 16 == 13) {
					Hexidecimal += "d";
				} else if (decimal % 16 == 14) {
					Hexidecimal += "e";
				} else if (decimal % 16 == 15) {
					Hexidecimal += "f";
				}
				decimal = (decimal - (decimal % 16)) / 16;
			}
		}
		String hexidecimalCopy = Hexidecimal;
		Hexidecimal = "";
		for (int i = hexidecimalCopy.length() - 1; i >= 0; i--) {
			Hexidecimal += String.valueOf(hexidecimalCopy.charAt(i));
		}
		return Hexidecimal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(obj0.convert(answer.getText()) + " | " + binaryToDecimal(answer.getText()) + " | " + binaryToHexidecimal(answer.getText()));
		frame.pack();
		
	}
}