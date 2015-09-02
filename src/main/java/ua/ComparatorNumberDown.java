package ua;

import java.util.Comparator;

public class ComparatorNumberDown implements Comparator<Client> {



		@Override
		public int compare(Client o1, Client o2) {
			return o2.getNumber()-o1.getNumber();
		}
		}
