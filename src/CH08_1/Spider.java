package CH08_1;

//interface는 extends 상속x
public class Spider implements Monster{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("거미 뜀");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("거미 걸음");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거미 공격");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날지 못함");
	}

}
