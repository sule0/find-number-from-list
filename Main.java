
public class Main {

	public static void main(String[] args) {
		int[] list = { 1, 2, 4, 6, 7, 12, 5 };
		int num = 12;
		int value;
		boolean isPrime = true;
		for (int i = 0; i < list.length; i++) {

			value = list[i];

			if (value == num) {

				isPrime = true;
				break;

			} else {
				isPrime = false;

			}

		}
		if (isPrime == true) {
			System.out.println("This number is in to the list");
		}

		else if (isPrime == false) {
			System.out.println("This number isn't in to the list");
		}
	}

}
