package co.jeongeun.prj.product;

import co.jeongeun.prj.service.RemoteController;

public class LgTV implements RemoteController{

	@Override
	public void powerOn() {
		System.out.println("LG TV 전원을 켠다");
		
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV 전원을 끈다");
		
	}

}
