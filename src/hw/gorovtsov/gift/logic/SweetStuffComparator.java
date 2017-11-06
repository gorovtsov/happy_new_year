package hw.gorovtsov.gift.logic;

import java.util.Comparator;

import hw.gorovtsov.gift.entity.SweetStuff;

public class SweetStuffComparator implements Comparator<SweetStuff>{

	@Override
	public int compare(SweetStuff sweet1, SweetStuff sweet2) {
		if(sweet1.getContainsSugar() == sweet2.getContainsSugar()) {
			return 0;
		}
		if (sweet1.getContainsSugar() < sweet2.getContainsSugar()) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
