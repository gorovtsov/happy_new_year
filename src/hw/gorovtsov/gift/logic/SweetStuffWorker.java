package hw.gorovtsov.gift.logic;

import java.util.ArrayList;
import java.util.TreeSet;

import hw.gorovtsov.gift.entity.SweetStuff;

public class SweetStuffWorker {
	public void showAllSweets(TreeSet<SweetStuff> gift) {
		for (SweetStuff sweety : gift) {
			System.out.println(sweety);
		}
	}

	public void showSweetsBySugar(TreeSet<SweetStuff> gift, int first, int second) {
		int max = 0;
		int min = 0;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		for (SweetStuff sweety : gift) {
			if (sweety.getContainsSugar() >= min && sweety.getContainsSugar() <= max) {
				System.out.println(sweety.toString());
			}
		}
	}
}
