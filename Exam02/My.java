package Exam02;

public class My { //
//	public void 꼬깔콘Open(꼬깔콘 snack) {
//		snack.open();
//	}
//	public void 홈런볼Open(홈런볼 snack) {
//		snack.open();
//	}
//	public void 썬칩Open(썬칩 snack) {
//		snack.open();
//	}
	public void SnackOpen(Snack snack) {
		snack.open();
		// 업캐스팅 된 상태에서 일시적으로 하위클래스에 있는
		// 기능을 수행하고 싶을 때 -> 다운캐스팅!
		// 하위클래스명 다운캐스팅객체명 = (하위클래스명) 업캐스팅 된 객체명

		if (snack instanceof 썬칩) {
			// snack 이라는 객체가 썬칩에서 왔는지를 instanceof가 true false를 판단
			// snack 이라는 변수가 썬칩으로부터
			// 업캐스팅 된 변수하면
			// 다운캐스팅해주세요
			썬칩 ssunChip = (썬칩) snack;
			ssunChip.sauce();
		}
	}
}
