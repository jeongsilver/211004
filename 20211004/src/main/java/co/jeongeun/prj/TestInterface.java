package co.jeongeun.prj;

import co.jeongeun.prj.service.RemoteController;

public class TestInterface {
	private RemoteController rc;
	
	public TestInterface(RemoteController rc) {
		this.rc=rc; //remotecontroller을 매개변수로 받아서 반드시 rc를 던져줘야 함 
	
	}
	
	public String toString() {
		rc.powerOn();
		rc.powerOff();
		return null;
	
	}
	
	public RemoteController rcReturn() {
		return rc;
	}
}
