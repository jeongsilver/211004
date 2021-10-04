package co.jeongeun.prj.product;

import co.jeongeun.prj.service.RemoteController;

public class SamsungTV implements RemoteController {

	public void powerOn() {
		System.out.println("삼성tv를 켭니다");
		
	}

	public void powerOff() {
		System.out.println("삼성tv를 끕니다");
		
	}

}
