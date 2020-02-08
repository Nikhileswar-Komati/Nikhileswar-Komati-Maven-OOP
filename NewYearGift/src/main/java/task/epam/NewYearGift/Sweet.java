package task.epam.NewYearGift;

public class Sweet implements itemProperties{
	private int cost, wt;
	String nameOfSweet;
	Sweet(int price, int weight){
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
