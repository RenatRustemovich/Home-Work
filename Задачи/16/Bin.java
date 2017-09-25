
public class Bin {
	public static void main(String [] args){
		if (args.length < 1) {
		System.err.println("Please enter data");}
		String s1 = "";
		int k = 0;
		Integer s = Integer.parseInt(args[0]);
		s1 = Integer.toBinaryString(s);
		System.out.println(s1);
		int a = Integer.parseInt(s1);
		while (a!=0){
			if ((a % 10) == 1) {
				k = k + 1;}
				a = a /10;
		}
		System.out.println("Колличество единиц : "+k);
	}
}