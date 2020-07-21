package by.htp.les2.main;

public class Task6 {

	public static void main(String[] args) {
		double angle1 = 54.5;
		double angle2 = 35.5;
		
		if (angle1 + angle2 < 180) {
			System.out.print("Такой треугольник существует ");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2 == 90)) {
				System.out.print("и он - прямоугольный!");
			} else {
				System.out.print("и он - не прямоугольный!");
			}
		}
		else {
			System.out.print("Такого треугольника не существует!");
		}
	}

}
