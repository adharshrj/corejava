package WK2.D4;

import java.util.*;

// create the Shop class
class Shop {
	int PNo;
	String name;
	int price;

	// constructor
	Shop(int PNo, String name, int price)
	{
		this.PNo = PNo;
		this.name = name;
		this.price = price;
	}
}

// creates the comparator for comparing stock value
class StockComparator implements Comparator<Shop> {

	// override the compare() method
	public int compare(Shop s1, Shop s2)
	{
		if (s1.price == s2.price)
			return 0;
		else if (s1.price > s2.price)
			return 1;
		else
			return -1;
	}
}

class SortingComparator {
	public static void main(String[] args)
	{
		// create the ArrayList object
		ArrayList<Shop> s = new ArrayList<Shop>();
		s.add(new Shop(218, "Apple Macbook Pro", 129999));
		s.add(new Shop(223, "Apple Macbook Air", 99999));
		s.add(new Shop(423, "Dell XPS 15 9500", 94999));
		s.add(new Shop(512, "Lenovo X1 Carbon", 119999));
		s.add(new Shop(723, "HP ENVY X360", 84999));

		System.out.println("before sorting");
		for (Shop shop : s) {
			System.out.println(shop.price + " " + shop.name
							+ " " + shop.PNo);
		}
		System.out.println();

		System.out.println(
			"Sorting by Price");

		// call the sort function
		Collections.sort(s, new StockComparator());
		for (Shop shop : s) {
			System.out.println(shop.price + " " + shop.name
							+ " " + shop.PNo);
		}
	}
}
