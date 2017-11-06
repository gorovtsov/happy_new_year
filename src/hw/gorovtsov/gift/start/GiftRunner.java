package hw.gorovtsov.gift.start;

import java.util.ArrayList;
import java.util.TreeSet;
import hw.gorovtsov.gift.entity.*;
import hw.gorovtsov.gift.logic.SweetStuffComparator;
import hw.gorovtsov.gift.logic.SweetStuffUserDialog;
import hw.gorovtsov.gift.logic.SweetStuffWorker;

public class GiftRunner {

	public static void main(String[] args) {
		TreeSet<SweetStuff> gift = new TreeSet<SweetStuff>(new SweetStuffComparator());

		gift.add(new BitterChocolate());
		gift.add(new ChocolateCandy());
		gift.add(new JellyCandy());
		gift.add(new Lollipop());
		gift.add(new MilkChocolate());
		gift.add(new WaferCandy());
		gift.add(new WhiteChocolate());

		
		SweetStuffWorker sw = new SweetStuffWorker();
		SweetStuffUserDialog ud = new SweetStuffUserDialog();
		ud.showMainMenu();
		
		int choise = ud.numInput();

		if (choise == 1) {
			sw.showAllSweets(gift);
		}
		if (choise == 2) {
			int firstVal = 70;
			int secondVal = 40;

			sw.showSweetsBySugar(gift, firstVal, secondVal);
		}
	}

}
