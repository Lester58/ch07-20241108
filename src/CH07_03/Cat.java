package CH07_03;

public class Cat extends Animal{
	
	
	
	

	public Cat() {
		super();
	}

	public Cat(String kind) {
		super(kind);
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound = "멍멍";
		return sound;
	}

}