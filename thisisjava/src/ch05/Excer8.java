package ch05;

public class Excer8 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int total = 0;
		int count = 0;
		for (int i=0; i<array.length; i++) {
			int[] arr = array[i];
			for (int j=0; j<arr.length; j++) {
				total += arr[j];
				count++;
			}
		}
		System.out.println(total);
		System.out.println((double)total / count);
		
		total = 0;
		count = 0;
		for (int[] arr : array) {
			for (int a : arr) {
				total += a;
				count++;
			}
		}
		System.out.println(total);
		System.out.println((double)total / count);
	}

}
