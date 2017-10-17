public class Task30 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Please enter correct String");
			System.exit(0);
		}
		String s = args[0];
		boolean t = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				t = false;
				break;
			}
		}
		if (t) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println(" NOT Palindrom");
		}
	}
}