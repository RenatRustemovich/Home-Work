public class Task10{
	public static void main(String [] args){
		if (args.length < 1){
			System.err.println("Please enter data");
		}
		if (Integer.parseInt(args[0]) < 2){
			System.err.println("Please enter corect data");
		}
		int n = Integer.parseInt(args[0]);
		for (int k = 1; k <= n; k++){
			System.out.println();
			for (int i = 1; i <= n; i++){
				System.out.print("* ");
			}
		}
	}
}