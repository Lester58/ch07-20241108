package CH08_1;

public class Television implements RemoteControl {


	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 를 끕니다");
	}

	@Override
	public void setVoume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOUME) {
			this.volume = RemoteControl.MAX_VOUME;
		}else if(volume < RemoteControl.MIN_VOUME) {
			this.volume = RemoteControl.MIN_VOUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : "+this.volume);
		
		
		
	}

}
