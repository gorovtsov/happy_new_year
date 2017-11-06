package hw.gorovtsov.gift.logic;

import java.util.Scanner;


public class SweetStuffUserDialog {
	
	//метод принимает только целочисленные значения
	public int numInput() {
		int x = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.nextInt();
		}

		x = sc.nextInt();
		return x;
	}
	
	public void showMainMenu() {
		System.out.print("1. Вывести список сладостей в подарке.\n2. Найти конфету по содержанию сахара.");
	}
	
	public void askForIntervalStart() {
		System.out.println("Введите начало интервала (между 0 и 100): ");
	}
	public void askForIntervalEnd() {
		System.out.println("Введите конец интервала (между 0 и 100): ");
	}
}
