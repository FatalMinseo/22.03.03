package Exam01;

public class MouseMain {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.rightClick();
		mouse.leftClick();

		WheelMouse wheelmouse = new WheelMouse();
		wheelmouse.rightClick();
		wheelmouse.leftClick();
		wheelmouse.scroll();

		Mouse mouse3 = wheelmouse; // 업캐스팅 - 상위객체 새로운변수 = 하위객체
		mouse3.rightClick();
		mouse3.leftClick(); // 오버라이딩한 기능일 경우 업캐스팅 되면 자식에 있는 기능 수행
//		mouse3.scoll(); 업캐스팅 되어 자식만 갖고 있던 scroll 기능이 사라짐
		
		// 업캐스팅 자식만 갖고 있는 기능 상실, 오버라이딩했을 경우 자식기능 수행
		
	}
}
