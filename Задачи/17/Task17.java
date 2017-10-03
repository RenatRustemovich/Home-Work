public class Task17 {
	public static void main(String [] args){
		if (args.length < 2) {
			System.err.println("Please enter correct data");}
		if (Integer.parseInt(args[1]) < 0) {
			System.err.println("Please enter correct data");}
			
		Integer s = Integer.parseInt(args[0]);
		Integer k = Integer.parseInt(args[1]);
		System.out.println(Integer.toString(s, k));
	}
}