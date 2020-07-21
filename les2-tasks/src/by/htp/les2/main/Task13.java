package by.htp.les2.main;
import java.io.*;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) throws IOException {
		int x;
		int i = 1;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        x = in.nextInt();
        in.close();
		
		while (i <= x) {
			sum += i;
			i++;
		}
		System.out.println("Искомая сумма: " + sum);
	}

}
