package hw.gorovtsov.gift.start;

import java.util.ArrayList;
import java.util.TreeSet;

import hw.gorovtsov.gift.entity.BitterChocolate;
import hw.gorovtsov.gift.entity.ChocolateCandy;
import hw.gorovtsov.gift.entity.JellyCandy;
import hw.gorovtsov.gift.entity.Lollipop;
import hw.gorovtsov.gift.entity.MilkChocolate;
import hw.gorovtsov.gift.entity.SweetStuff;
import hw.gorovtsov.gift.entity.WaferCandy;
import hw.gorovtsov.gift.entity.WhiteChocolate;
import hw.gorovtsov.gift.logic.SweetStuffComparator;
import hw.gorovtsov.gift.logic.SweetStuffUserDialog;
import hw.gorovtsov.gift.logic.SweetStuffWorker;
import javafx.collections.transformation.SortedList;

public class GiftTester {
	public static void main(String[] args) {
		/*
		 * TreeSet<SweetStuff> gift = new TreeSet<SweetStuff>(); gift.add(new
		 * Lollipop());
		 * 
		 * System.out.print(gift);
		 */

		/*SweetStuffUserDialog ud = new SweetStuffUserDialog();
		int a = ud.numInput();
		System.out.println(a);*/
		
		ArrayList<SweetStuff> gift = new ArrayList<SweetStuff>();

		gift.add(new ChocolateCandy());
		gift.add(new BitterChocolate());
		gift.add(new Lollipop());
		
/*		gift.add(new JellyCandy());
		gift.add(new Lollipop());
		gift.add(new MilkChocolate());
		gift.add(new WaferCandy());
		gift.add(new WhiteChocolate());
		*/
		gift.sort(new SweetStuffComparator());
		for(SweetStuff sweety: gift) {
			System.out.println(sweety);
		}
		/*SweetStuffWorker sw = new SweetStuffWorker();
		SweetStuffUserDialog ud = new SweetStuffUserDialog();
		
		sw.showSweetsBySugar(gift, 0, 100);*/
	}

}
