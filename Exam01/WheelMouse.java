package Exam01;

public class WheelMouse extends Mouse {

	public void scroll() {
		System.out.println("스크롤하였습니다.");
	}
	
	@Override
	public void leftClick() {
		System.out.println("왼쪽클릭");
		System.out.println("드래그");
	}
}
