package ua;

import java.util.Comparator;

public class ComparatorCashDown implements Comparator<Client> {



		@Override
		public int compare(Client o1, Client o2) {
			return  (int) (o2.getCash()-o1.getCash());
		}
		}
