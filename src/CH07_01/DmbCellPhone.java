package CH07_01;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	public DmbCellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DmbCellPhone(int channel) {
		super();  // 부모 클래스 생성자 호출
		this.channel = channel;
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);  // 부모 클래스 생성자 호출
//		this.model = model; // 부모로부터 물려받은필드
//		this.color = color; // 부모로부터 물려받은필드
		this.channel = channel;
	}
	//메소드
	void turnOnDmb() {
		System.out.println("dmb 전원을 켭니다");
	}
	void turnOffDmb() {
		System.out.println("dmb 전원을 끕니다");
	}
	void changeChannel() {
		System.out.println("dmb 채널을 변경합니다");
	}
	
}
