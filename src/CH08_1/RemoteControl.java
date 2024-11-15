package CH08_1;

public interface RemoteControl {
	public int MAX_VOUME = 10;//상수선언
	public int MIN_VOUME = 0;
	
	//추상 메소드
	public void turnOn();//추상 메소드(메소드 선언부만 작성)
	public void turnOff();//추상 메소드(메소드 선언부만 작성)
	public void setVoume(int volume);
	
}
