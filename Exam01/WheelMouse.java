package Exam01;

public class WheelMouse extends Mouse {

	public void scroll() {
		System.out.println("��ũ���Ͽ����ϴ�.");
	}
	
	@Override
	public void leftClick() {
		System.out.println("����Ŭ��");
		System.out.println("�巡��");
	}
}
