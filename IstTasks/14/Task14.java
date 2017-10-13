public class Task14 {
	public static void main(String [] args){
		if (args.length < 1) {
			System.err.println("Please enter data");}
		if (Integer.parseInt(args[0]) < 1) {
			System.err.println("Please enter correct data");
		}
		int S = 1;
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++){
			S = S*i;
		}
		System.out.println(S);
	}
}