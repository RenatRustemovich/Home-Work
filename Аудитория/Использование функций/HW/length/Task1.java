public class Task1{
	public static int numLength(int n){
		int k = 0;
		if (n == 0) {
			k = 0;
		}
		else{
			while (n != 0) {
			k += 1;
			n = n/10;
			}
		}
		return(k);	
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if ((args.length != 1)||(n <= 0)) {
			System.err.println("Please enter correct data");
			System.exit(0);
		}
		System.out.println(numLength(n));
	}
}