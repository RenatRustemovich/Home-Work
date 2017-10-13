public class Task1{
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Plase enter correct datas");
		}
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		if ((x == 0)||(y == 0)) {
			System.err.println("Please enter correct datas");
		}
		if (y == 1.0/x + x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
