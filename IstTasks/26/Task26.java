public class Task26 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Please enter correct data");
		}
		int n = Integer.parseInt(args[0]);
		if (n < 1) {
			System.err.println("Please enter correct data");
		}
		if (n == 1) {
			System.out.println("1");
		} 
		else {
			if (n == 2) {
					System.out.println(" 1");
					System.out.println("1 1");
				}	
		}
		int[][] arr = new int[n][n];
		if (n >= 3) {
					
				arr[0][0] = 1; 
				arr[1][0] = 1;
				arr[1][1] = 1;
				for (int i = 2; i < n; i++ ) {
					arr[i][0] = 1;
					for (int j = 1; j < i+1 ;j++ ) {
						if (i == j) {
							arr[i][j] = 1;
						}
						else{
							arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
						}
					}
				}


		}
		for (int i = 0; i < n; i++ ) {
			for (int k = 0; k <= n-i; k++) {
					System.out.print(" ");
				}
			for (int j = 0; j <= i ; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}
}