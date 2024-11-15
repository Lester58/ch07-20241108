package CH08_1;

public interface Monster {//인터페이스->인스턴스(객체)로 만들 수 없음
	//초기값이 없는 필드 선언은 에러->상수만 선언가능
	int health=300;
	//생성자x
	
	//메소드
	//인터페이스 내에는 추상메소드만 선언가능
	public void run();//추상 메소드
	public void walk();//추상 메소드
	public void attack();//추상 메소드
	public void fly();//추상 메소드
}

//인터페이스의 특징
//인스턴스(객체) 생성 불가능(new 연산자 사용x) -> 상속 전용
//상수만 선언 가능
//추상 메소드만 선언 가능
