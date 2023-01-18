package sandwich;

public class Order {
	
	private SandwichDTO[] order = new SandwichDTO[5];
	private String[] drink = new String[10];
	private int index = 0;
	private int drinkIndex = 0;
	
	public void makeOrder(SandwichDTO order) {
		this.order[index] = new SandwichDTO
						(order.getName(), 
						order.getBread(), 
						order.getMain(), 
						order.getVeggie(), 
						order.getSauce());
		index++;
	}
	
	public void showOrder() {
		System.out.println("====샌드위치 주문 목록====");
		for (int i = 0; i < order.length; i++) {
			if(order[i] != null) {
				System.out.println(order[i].getName() + " : " 
								+ order[i].getBread() + " | "
								+ order[i].getMain() + " | "
								+ order[i].getVeggie() + " | "
								+ order[i].getSauce());
			} else {
				break;
			}
		}
	}
	
	public void makeDrinkOrder(int no) {
		
	}
	
	public void showDrinkOrder() {
		System.out.println("====음료 주문 목록====");
	}
}
