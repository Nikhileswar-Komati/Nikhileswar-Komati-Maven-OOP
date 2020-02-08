package task.epam.NewYearGift;

public class ReadData extends NewYearGift{
	
	public void readChocolates() {
		System.out.println("Enter the no of chocolates");
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter type of Chocolate 1.Candy 2.Tofee");
			int type = s.nextInt();
			System.out.println("Enter weight of chocolate");
			int weight = s.nextInt();
			System.out.println("Enter price of chocolate");
			int price = s.nextInt();
			
			if(type == 1) {
				System.out.println("Enter the name of candy");
				String candyName = s.next();
				
				if(nameWeight.containsKey(candyName)) {
					nameWeight.put(candyName, (int)nameWeight.get(candyName) + weight);
				} 
				
				else{
					nameWeight.put(candyName, weight);
				}
				
				if(namePrice.containsKey(candyName)) {
					namePrice.put(candyName, (int)namePrice.get(candyName)+price);
				}
				
				else {
					namePrice.put(candyName, price);
				}
			}
			Chocolate choco = new Chocolate(price, weight);
			chocolate.add(choco);
			if(type == 1) {
				candy.add(choco);
			}			
		}
	}

	public void readSweets() {
		System.out.println("Enter no of sweets");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the weight of the sweet");
			int weight = s.nextInt();
			System.out.println("Enter the price of the sweet");
			int price = s.nextInt();
			Sweet Sweet = new Sweet(weight,price);
			sweet.add(Sweet);
		}
	}
}
