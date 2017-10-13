public class Task13 {
	public static void main(String [] args){
		if (args.length < 2) {
			System.err.println("Please enter two numbers");}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+" "+b);
		a = a + b;
		b = b - a;
		b = -b;
		a = a - b;
		System.out.println(a+" "+b);
	}
}