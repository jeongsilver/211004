package co.jeongeun.prj.service;

public interface Pencil {
	void selectPencil();
	
	default void pencilInterface() {//default는 interface 안에 있다
		System.out.println("나는 인터페이스 입니다");
	}
}
