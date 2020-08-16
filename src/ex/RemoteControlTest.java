package ex;

import java.util.Scanner;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc=null;
		System.out.println("선택 1.TV 2.AUDIO >");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		switch (n) {
		case 1:
			System.out.println("TV리모콘이 지정되었습니다.");
			rc=new Tv();
			break;
		case 2:
			rc=new Audio();
			System.out.println("오디오 리모콘이 지정되었습니다.");
			break;
		default:
		}
		//////////////////////////////////
		rc.turnON();
		for(int i=0; i<12; i++) {
			rc.setVolume(i);
		}
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		//rc=new Audio();
		//rc.turnON();
		//rc.turnOff();
	}

}
