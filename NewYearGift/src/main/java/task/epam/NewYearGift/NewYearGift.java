package task.epam.NewYearGift;

import java.util.*;

abstract public class NewYearGift {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Chocolate> chocolate = new ArrayList<Chocolate>();
	static ArrayList<Chocolate> candy = new ArrayList<Chocolate>();
	static ArrayList<Sweet> sweet = new ArrayList<Sweet>();
	static HashMap<String,Integer> nameWeight = new HashMap<String,Integer>();
	static HashMap<String,Integer> namePrice = new HashMap<String,Integer>();
	abstract public void readChocolates();
	abstract public void readSweets();
	public static void main(String[] args){
		ReadData obj = new ReadData();
		obj.readChocolates();
		obj.readSweets();
		System.out.println("Total weight: " + totalWeight());
		System.out.println("Choose a way to Sort: 1.By Price  2.By weight");
		int sortingType = s.nextInt();
		if(sortingType == 1) {
			Comparator<Chocolate> compareByPrice = (Chocolate c1, Chocolate c2)->((Integer) c1.getCost()).compareTo(c2.getCost());
			Collections.sort(chocolate,compareByPrice);
		} else if(sortingType == 2) {
			Comparator<Chocolate> compareByWeight = (Chocolate c1, Chocolate c2)->((Integer) c1.getWeight()).compareTo(c2.getWeight());
			Collections.sort(chocolate,compareByWeight);
		}
		System.out.println("Sorted Result:");
		for(Chocolate c: chocolate) {
			System.out.println(c.getCost());
		}
		range(sortingType);
	}
	
	
	
	
	public static int totalWeight() {
		int totalWeight = 0;
		for(Chocolate c: chocolate) {
			totalWeight += c.getWeight();
		}
		
		for(Sweet s: sweet) {
			totalWeight += s.getWeight();
		}
		return totalWeight;
	}
	
	public static void range(int sortingType) {
		int lowerLimit, higherLimit;
		if(sortingType == 1) {
			System.out.println("Enter lowerLimit of price");
			lowerLimit = s.nextInt();
			
			System.out.println("Enter higherLimit of price");
			higherLimit = s.nextInt();
			Set<Map.Entry<String, Integer>> candySet = namePrice.entrySet();
			Iterator<Map.Entry<String, Integer>> candyIterator = candySet.iterator();
			while(candyIterator.hasNext()) {
				Map.Entry<String, Integer> candyElement = (Map.Entry<String, Integer>) candyIterator.next();
				int curPrice = (int) candyElement.getValue();
				if(curPrice>=lowerLimit && curPrice<=higherLimit) {
					System.out.println(candyElement.getKey());
				}
			}
		} 
		else {
			System.out.println("Enter lowerLimit of weight");
			lowerLimit = s.nextInt();
			
			System.out.println("Enter higherLimit of weight");
			higherLimit = s.nextInt();
			Set<Map.Entry<String, Integer>> candySet = nameWeight.entrySet();
			Iterator<Map.Entry<String, Integer>> candyIterator = candySet.iterator();
			while(candyIterator.hasNext()) {
				Map.Entry<String, Integer> candyElement = (Map.Entry<String, Integer>) candyIterator.next();
				int curWeight = (int) candyElement.getValue();
				if(curWeight>=lowerLimit && curWeight<=higherLimit) {
					System.out.println(candyElement.getKey());
				}
			}
		}
	}
}