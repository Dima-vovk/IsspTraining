package ua;

import java.util.Comparator;

public class ComparatorCashUP implements Comparator<Client> {



		@Override
		public int compare(Client o1, Client o2) {
			return  (int) (o1.getCash()-o2.getCash());
		}
		}
