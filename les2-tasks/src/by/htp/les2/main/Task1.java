package by.htp.les2.main;

public class Task1 {

	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		double c = 4;
		
		if (b*b - 4*a*c < 0) { 		
			System.out.print("Нельзя вычислить действительный корень из отрицательного числа!");
		}
		else if (a == 0) {
			System.out.print("Нельзя делить на ноль!");
		}
		else {
			double rez = (b + Math.sqrt(b*b - 4*a*c))/2/a - Math.pow(a, 3)*c + Math.pow(b, -2);
			System.out.print("Результат: " + rez);
		}
	}

}
