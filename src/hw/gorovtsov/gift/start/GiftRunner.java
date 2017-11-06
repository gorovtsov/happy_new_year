package hw.gorovtsov.gift.start;

import java.util.ArrayList;
import java.util.TreeSet;
import hw.gorovtsov.gift.entity.*;
import hw.gorovtsov.gift.logic.SweetStuffComparator;
import hw.gorovtsov.gift.logic.SweetStuffUserDialog;
import hw.gorovtsov.gift.logic.SweetStuffWorker;

public class GiftRunner {

	public static void main(String[] args) {
		ArrayList<SweetStuff> gift = new ArrayList<SweetStuff>();

		gift.add(new BitterChocolate());
		gift.add(new ChocolateCandy());
		gift.add(new JellyCandy());
		gift.add(new Lollipop());
		gift.add(new MilkChocolate());
		gift.add(new WaferCandy());
		gift.add(new WhiteChocolate());
		
		gift.sort(new SweetStuffComparator());
		
		SweetStuffWorker sw = new SweetStuffWorker();
		SweetStuffUserDialog ud = new SweetStuffUserDialog();
		ud.showMainMenu();
		
		int choise = ud.numInput();

		if (choise == 1) {
			sw.showAllSweets(gift);
		}
		if (choise == 2) {
			int firstVal = 0;
			int secondVal = 0;

			while (!(firstVal >= 0 && firstVal <= 100) && !(secondVal >= 0 && secondVal <= 100)) {
				ud.askForIntervalStart();
				firstVal = ud.numInput();
				ud.askForIntervalEnd();
				secondVal = ud.numInput();
			}

			sw.showSweetsBySugar(gift, firstVal, secondVal);
		}
	}

}
