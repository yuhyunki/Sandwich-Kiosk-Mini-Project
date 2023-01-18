package sandwich;

public class SandwichDTO {

	private String name;
	private String bread;
	private String main;
	private String veggie;
	private String sauce;
	
	/**
	 * 샌드위치의 객체는 아래 4개의 매개변수 없이 생성될 수 없다. 
	 * @param name 선택된 샌드위치의 이름
	 * @param bread 선택된 빵의 종류
	 * @param main 선택된 메인 재료(주로 고기류)의 종류
	 * @param veggie 선택된 야채의 종류
	 * @param sauce 선택된 소스의 종류
	 */
	public SandwichDTO(String name, String bread, String main, String veggie, String sauce) {
		super();
		this.name = name;
		this.bread = bread;
		this.main = main;
		this.veggie = veggie;
		this.sauce = sauce;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getVeggie() {
		return veggie;
	}

	public void setVeggie(String veggie) {
		this.veggie = veggie;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void printAllInfo() {
		System.out.println("메뉴명 : " + name);
		System.out.println("빵 : " + bread);
		System.out.println("메인 : " + main);
		System.out.println("야채 : " + veggie);
		System.out.println("소스 : " + sauce);
	}
	
}
