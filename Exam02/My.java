package Exam02;

public class My { //
//	public void ������Open(������ snack) {
//		snack.open();
//	}
//	public void Ȩ����Open(Ȩ���� snack) {
//		snack.open();
//	}
//	public void ��ĨOpen(��Ĩ snack) {
//		snack.open();
//	}
	public void SnackOpen(Snack snack) {
		snack.open();
		// ��ĳ���� �� ���¿��� �Ͻ������� ����Ŭ������ �ִ�
		// ����� �����ϰ� ���� �� -> �ٿ�ĳ����!
		// ����Ŭ������ �ٿ�ĳ���ð�ü�� = (����Ŭ������) ��ĳ���� �� ��ü��

		if (snack instanceof ��Ĩ) {
			// snack �̶�� ��ü�� ��Ĩ���� �Դ����� instanceof�� true false�� �Ǵ�
			// snack �̶�� ������ ��Ĩ���κ���
			// ��ĳ���� �� �����ϸ�
			// �ٿ�ĳ�������ּ���
			��Ĩ ssunChip = (��Ĩ) snack;
			ssunChip.sauce();
		}
	}
}
