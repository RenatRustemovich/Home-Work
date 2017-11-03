public class Task54{
	public static void main(String[] args) {
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			}

		int n = Integer.parseInt(args[0]);
		if (n < 0) {
			System.err.println("Please enter correct data");
			System.exit(1);
		}
		int fib1 = 1;
		int fib2 = 1;
		int i = 2;
		int fibsum = (n == 1 ? 1 : (n == 2 ? 2 : 0));
		//(условие ? если истина : если ложно)
		while (i < n) {
			fibsum = fib1 + fib2;
			fib2 = fibsum;
			i+= 1;
		}
		System.out.println(fibsum);
	}
}