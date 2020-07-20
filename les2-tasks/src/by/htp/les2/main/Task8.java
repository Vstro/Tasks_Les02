package by.htp.les2.main;

public class Task8 {

	public static void main(String[] args) {
		double A = 2;
		double B = 6;
		double x = 2;
		double y = 7;
		double z = 7;

		if ((x <= A && y <= B) || (y <= A && x <= B) || (x <= A && z <= B) || (z <= A && x <= B) || 
				(z <= A && y <= B) || (y <= A && z <= B)) {
			System.out.println("Кирпич пройдёт через отверстие!");
		} else {
			System.out.println("Кирпич не пройдёт через отверстие!");
		}
	}

}
