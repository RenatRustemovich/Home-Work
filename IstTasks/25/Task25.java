public class Task25 {
	public static void main(String[] args) {
		int[] arr = {3, 4, 7, 8, 1, 2, 5, 6, 9, 10};
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + "; ");
			System.out.println();
		}
		System.out.println();
		int change = 0;
		for (int i = arr.length-1; i >= 0; i-- ) {
			for (int k = 0; k < i; k++ ) {
				if (arr[k] > arr[k+1]) {
					change = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = change;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + "; ");
			System.out.println();
		}
	}
}