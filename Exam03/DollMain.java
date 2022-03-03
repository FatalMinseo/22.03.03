package Exam03;

public class DollMain {

	public static void main(String[] args) {

		Machine ma = new Machine();
		
		Pika pika =new Pika();
		Piri piri =new Piri();
		Squi squi =new Squi();
		Doll doll =new Doll();
		
		ma.getDoll(pika);
		ma.getDoll(piri);
		ma.getDoll(squi);
		ma.getDoll(doll);
	
		
	}

}
