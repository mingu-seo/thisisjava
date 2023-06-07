package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum = 0;
		System.out.println("배열길이:"+scores.length);
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
//		double avg = (double)sum / 3;
//		System.out.println("평균 : "+avg);
		printItem(new int[] { 83, 90, 87 });
	}


	public static void printItem(int[] scores) {
		for (int i=0; i<scores.length; i++) {
			System.out.println("score["+i+"]: "+scores[i]);
		}
	}
}