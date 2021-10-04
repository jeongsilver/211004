package co.jeongeun.prj.tryexam;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {

	public void method1() {
		
		try {
			Class clazz = Class.forName("co.jeongeun.prj.TestInterface");
//			Class clazz = Class.forName("co.jeongeun.prj.TV");
			//클래스를 로드 시켜달라는 의미
			System.out.println("원하는 클래스가 존재합니다");
			
		}catch(Exception e) {
		//catch(ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("예기치 않는 오류가 발생했습니다");
			System.out.println("관리자에게 문의 하세요");
		}
	}
	
	
	public void method2() throws Exception {//추상클래스나 인터페이스에서 많이 사용함
		
		try {
//			Class clazz = Class.forName("co.jeongeun.prj.TV");
			Class clazz = Class.forName("co.jeongeun.prj.TestInterface");
			System.out.println("원하는 클래스가 존재합니다");
			
		}catch(Exception e) {
			
		}
	}
}
