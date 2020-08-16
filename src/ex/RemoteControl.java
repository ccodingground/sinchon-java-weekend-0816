package ex;

public interface RemoteControl {
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//추상메서드 입니다. 모두 public abstract 메서드
	void turnON();
	abstract void turnOff();
	public abstract void setVolume(int volume);
	//default 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리!");
		}else {
			System.out.println("무음 해제!");
		}
	}
	//static 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환하세요");
	}
	
}
