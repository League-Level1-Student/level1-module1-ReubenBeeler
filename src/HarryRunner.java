public class HarryRunner {
	static HarryPotter H0 = new HarryPotter();
	
	public static void main(String args[]) {
		H0.makeInvisible(true);
		H0.spyOnSnape();
		H0.makeInvisible(false);
		H0.castSpell("stupefy");
	}
}