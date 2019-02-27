import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sun.security.util.Length;

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
		String decimal = binaryToDecimal(input);
		if (decimal.equals("")) {
			return "";
		} else {
			while (Integer.parseInt(While(input)) >= 16) {
				
			}
			
		}
		return input;
	}
	
	public String While(String input) {
		int count = 0;
		while (Integer.parseInt(input) >= 16) {
			input = String.valueOf(Integer.parseInt(input) - 16);
			count += 1;
		}
		return input;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(obj0.convert(answer.getText()) + " " + binaryToDecimal(answer.getText()));
		frame.pack();
		
	}
}