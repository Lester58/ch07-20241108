package CH07_03;

public class SmartPhone extends Phone{

	public SmartPhone() {
		super();
	}
	
	

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	public void internetSearch() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 검색을 합니다");
		
	}



	@Override
	public void powerCType() {
		// TODO Auto-generated method stub
		System.out.println("전원 타입은 C Type입니다");
	}



	
	
	
}
