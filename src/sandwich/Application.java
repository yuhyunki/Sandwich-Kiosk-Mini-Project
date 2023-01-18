package sandwich;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Kiosk kiosk = new Kiosk();
		
		while(true) {
			System.out.println("======== SUBWAY ========");
			System.out.println("1. 샌드위치 메뉴 보기");
			System.out.println("2. 음료 메뉴 보기");
			System.out.println("3. 주문 목록 확인하기");
			System.out.println("9. 주문 목록 결제하기");
			System.out.println("0. 주문 취소하기");
			System.out.println("========================");
			
			System.out.print("무엇을 선택하시겠습니까? : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 0:
				System.out.println("구매를 취소합니다.");
				return;
			case 1:
				kiosk.makeSandwichMenu();
				kiosk.showSandwichMenu();
				break;
			case 2:
				kiosk.showDrinkMenu();
				break;
			case 3: 
				kiosk.showOrder();
				break;
			case 9:
				kiosk.payment();
				break;
			default :
				System.out.print("입력하신 번호가 보기에 없습니다.");
				break;
			}
		}
	}

}
