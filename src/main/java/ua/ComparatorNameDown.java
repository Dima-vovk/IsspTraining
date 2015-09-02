package ua;

import java.util.Comparator;

public class ComparatorNameDown implements Comparator<Client> {



		@Override
		public int compare(Client o1, Client o2) {
			return (o2.getName().compareTo(o1.getName()));
		}
		}
