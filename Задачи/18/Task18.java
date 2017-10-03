public class Task18 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		String res = "";
		long sum = 0;
		while(a != 0) {
			int p = a % k;
			if (p > 9) {
				res = (char)(p + 'A' - 10) + res;
			}
			else {
				res = (char)(p + '0') + res;
			}
			sum += p;
			a /= k;
		}
		System.out.println(res);
		System.out.println(sum);
	}
}
