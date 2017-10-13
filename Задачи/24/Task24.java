
public class Task24{
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Please enter correct data");
		}
		int n = Integer.parseInt(args[0]);
		if ((n % 2 == 0)&&(n >= 4)) {
			for (int i = 2; i <= n ; i = i + 2) {
				// Рисуем пробелы
				for (int k = 1; k <= (n-i)/2; k++ ) {
					System.out.print(' ');
				}
				// Рисуем звездочки башенкой
				for (int k = 1; k <= i; k++ ) {
					System.out.print('*');
				}
				
			System.out.println();
				
			}
			
			for (int i = n-2; i >= 0; i -= 2) {
				for (int k = 1; k <= (n-i)/2; k++) {
					System.out.print(' ');
				}
				for (int k = 1; k <= i ;k++ ) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}

