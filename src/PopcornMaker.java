import javax.swing.JOptionPane;

public class PopcornMaker {
	static Microwave mcw0 = new Microwave();
	static Popcorn pc0 = new Popcorn(JOptionPane.showInputDialog("Of what flavor is the popcorn?"));
	static int minutes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of minutes the popcorn will cook for: "));
	
	public static void main(String args[]) {
		mcw0.putInMicrowave(pc0);
		for (int i = minutes; i >= 0; i--) {
			pc0.applyHeat();
		}
		pc0.eat();
	}
}