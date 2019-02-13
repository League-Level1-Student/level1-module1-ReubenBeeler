

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar car0 = new RaceCar("Yugo", 5);
		// 2. Print the RaceCar's position in the race
		System.out.print(car0.getPositionInRace());
		// 3. Crash the RaceCar
		car0.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (car0.isDamaged() == true) {
			car0.pit();
		}
		// 5. Help the car move into first place.
		while (car0.getPositionInRace() != 1) {
			car0.overtake();
		}
	}
}
