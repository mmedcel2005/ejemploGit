package jUnit;

public class MyMath {
	static int sum(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];
		}
		return sum;
	}
}
