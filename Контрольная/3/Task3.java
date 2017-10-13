public class Task3{
	public static void main (String [] args){
		if (args.length != 2){
			System.err.println("Please enter correct data");
		}
		int x = Integer.parseInt(args[0]);
		if (x == 3){
			System.err.println("Please enter correct data");
		}
		int n = Integer.parseInt(args[1]);
		if (n < 1){
			System.err.println("Please enter correct data");
		}
		double S = 0;
		for (int i = 1; i <= n; i++){
			S = S + 1.0/( Math.pow(x,i) - 3);
		}
		System.out.println(S);
	}
}