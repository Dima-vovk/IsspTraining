package ua;

import java.util.Comparator;

public class ComparatorNameUP implements Comparator<Client> {



		@Override
		public int compare(Client o1, Client o2) {
			return (o1.getName().compareTo(o2.getName()));
		}
		}
