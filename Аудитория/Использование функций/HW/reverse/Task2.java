public class Task2{
	public static String reverse(int n){
		String s = "";
		int i = 0;
		while (n != 0) {
			i = n%10;
			s = s + i;
			n = n/10;
		}
		return(s);
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if ((args.length != 1)||(n <= 0)) {
			System.err.println("Please enter correct data");
			System.exit(0);
		}
		System.out.println(reverse(n));
	}
	
}