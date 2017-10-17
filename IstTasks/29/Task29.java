public class Task29 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Please enter correct strings");
			System.exit(0);
		}
		String src = args[0];
		String det = args[1];
		char det1 = det.charAt(0);
		boolean val = false;
		int fin = -1;
		for (int i = 0; i <= src.length() - det.length(); i++ ) {
			if (src.charAt(i) == det1) {
				val = true;
				for (int j = 0; j < det.length(); j++) {
					if (src.charAt(i+j) != det.charAt(j)) {
						val = false;
					}
				}
			}
			if (val) {
				fin = i;
				break;
			}
		}
		if (fin == -1){
			System.err.println("String not found");
			System.exit(0);
		}
		System.out.println(fin + 1);
	}
}