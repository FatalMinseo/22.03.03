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

		Mouse mouse3 = wheelmouse; // ��ĳ���� - ������ü ���ο�� = ������ü
		mouse3.rightClick();
		mouse3.leftClick(); // �������̵��� ����� ��� ��ĳ���� �Ǹ� �ڽĿ� �ִ� ��� ����
//		mouse3.scoll(); ��ĳ���� �Ǿ� �ڽĸ� ���� �ִ� scroll ����� �����
		
		// ��ĳ���� �ڽĸ� ���� �ִ� ��� ���, �������̵����� ��� �ڽı�� ����
		
	}
}
