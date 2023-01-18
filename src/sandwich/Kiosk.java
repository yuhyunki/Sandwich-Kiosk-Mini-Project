package sandwich;

import java.util.Scanner;

public class Kiosk {
	
	private SandwichDTO[] sandwich = new SandwichDTO[5];
	Order order = new Order();
	Drink drink = new Drink();
	
	Scanner sc = new Scanner(System.in);
	
	public void makeSandwichMenu() {
		
		sandwich[0] = new SandwichDTO("로스트치킨", "플랫브레드", "닭가슴살", "양상추", "칠리");
		sandwich[1] = new SandwichDTO("BLT", "허니오트", "베이컨", "양상추", "랜치");
		sandwich[2] = new SandwichDTO("에그마요", "위트", "계란", "양상추", "마요네즈");
		sandwich[3] = new SandwichDTO("참치", "하티", "참치", "양파", "마요네즈");
		sandwich[4] = new SandwichDTO("풀드포크", "플랫브레드", "바베큐", "양파", "바베큐");
		
	}
	
	public void showSandwichMenu() {
		for (int i = 0; i < sandwich.length;i++) {
			System.out.println((i + 1) + ". " + sandwich[i].getName());
		}
		
		System.out.print("원하시는 메뉴를 선택해주세요 : ");
		int no = sc.nextInt();
		
		while(true) {
			
			if(no > 0 && no < 6) {
				order.makeOrder(sandwich[no - 1]);
				break;
			} else {
				System.out.println("입력하신 번호가 보기에 없습니다.");
				continue;
			}
		}
	}
	
	public void showDrinkMenu() {
		drink.showDrink();
		
		System.out.print("원하시는 메뉴를 선택해주세요 : ");
		int no = sc.nextInt();
		
		while(true) {
			
			if(no > 0 && no < 6) {
				order.makeDrinkOrder(no);
				break;
			} else {
				System.out.println("입력하신 번호가 보기에 없습니다.");
				continue;
			}
		}
	}

	public void showOrder() {
		order.showOrder();
		order.showDrinkOrder();
	}

	public void payment() {
		System.out.println("결제를 진행하시겠습니까? : \n1. 예 \n2. 아니오");
		int no = sc.nextInt();
		
		switch(no) {
		case 1:
			System.out.println("성공적으로 결제를 진행했습니다.");
			return;
		case 2:
			System.out.println("결제를 취소하고 돌아갑니다.");
			break;
		}
	}
}
