package co.jeongeun.prj.product;

import co.jeongeun.prj.service.Pencil;
import co.jeongeun.prj.service.RemoteController;

public class MyPrint implements RemoteController{
//public class MyPrint implements Pencil, RemoteController{

	private Pencil pencil;
	public MyPrint(Pencil pencil) {
		this.pencil=pencil;
	}
	
	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다");
		
	}
	
	//오버라이드 하지 않고 내가 또 필요한 매서드를 여기서 정의 
	public void toPrint() {
		System.out.print("나는 ");
		pencil.selectPencil();
	}
	

//	@Override
//	public void selectPencil() {
//		System.out.println("4B");
//		
//	}

}
