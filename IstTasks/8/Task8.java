public class Task8{
	public static void main(String [] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
		}
		if (Integer.parseInt(args[0]) < 1){
			System.err.println("Please correct data");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		double S = Math.cos(x);
		for (int i = 1; i<=n; i++ ) {
			S = Math.cos(x + S);
		}
		System.out.println(S);
	}
}