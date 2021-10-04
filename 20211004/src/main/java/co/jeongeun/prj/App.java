package co.jeongeun.prj;

import co.jeongeun.prj.product.LgTV;
import co.jeongeun.prj.product.MyPrint;
import co.jeongeun.prj.product.Pecil6B;
import co.jeongeun.prj.product.Pencil4B;
import co.jeongeun.prj.product.SamsungTV;
import co.jeongeun.prj.service.Pencil;
import co.jeongeun.prj.service.RemoteController;
import co.jeongeun.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        RemoteController tv =  new SamsungTV();
//    	SamsungTV tv = new SamsungTV();
//        tv.powerOn();
//        tv.powerOff();
//      
//        tv = new LgTV();
//        tv.powerOn();
//        tv.powerOff();
//        
//        Pencil pencil = null;
//        pencil = new Pencil4B();
//        pencil.selectPencil();
//        pencil.pencilInterface();//pencil 인터페이스가 갖고 있는 기본 메소드
//        
//        pencil= new Pecil6B();
//        pencil.selectPencil();
//        
//        
//        //두개의 인터페이스를 상속 받을 땐 자식의 객체로 생성해줌
//        MyPrint myPrint = new MyPrint();
//        myPrint.powerOn();
//        myPrint.selectPencil();
//        myPrint.powerOff();
        
        //인터페이스 객체를 매개변수로 받은 것
//        RemoteController rc = new SamsungTV();
////        RemoteController rc;
//        rc = new LgTV();
   
////        TestInterface ts = new TestInterface(new LgTV());
////        rc=ts.rcReturn();
////        rc.powerOn();
////        rc.powerOff();
//        ts.toString();
        
//        MyPrint myPrint = new MyPrint(new Pencil4B());
//        myPrint.toPrint();
        
        TryCatchTest trycatchtest = new TryCatchTest();
//        trycatchtest.method1();
        try {
			trycatchtest.method2();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("항상 실행하는 구문");
		}
        
    }
}
