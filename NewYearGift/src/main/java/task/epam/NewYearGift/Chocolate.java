package task.epam.NewYearGift;

public class Chocolate implements itemProperties{
	private int cost, wt;
	String nameOfChocolate;
	Chocolate(int price, int weight){
		cost = price;
		wt = weight;
	}
	public int getCost() {
		return cost;
	}
	public int getWeight() {
		return wt;
	}
}
