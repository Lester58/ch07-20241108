package CH07_03;

public class Dog extends Animal{
	
	
	
	

	public Dog() {
		super();
	}

	public Dog(String kind) {
		super(kind);
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound = "야옹야옹";
		return sound;
	}

}


