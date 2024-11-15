package CH07_03;

public abstract class Animal {
	public String kind; //동물 종류

	public Animal() {
		super();
	}
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract String sound(); // 추상메소드
	

}
