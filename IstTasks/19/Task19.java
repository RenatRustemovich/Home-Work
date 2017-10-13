public class Task19 {
	public static void main(String [] args){
		if (args.length < 1) {
			System.err.println("Please enter data");}
		String s1 = "";
		int k = 0;
		int max = 0;
		Integer s = Integer.parseInt(args[0]);
		s1 = Integer.toBinaryString(s);
		System.out.println(s1);
		int a = Integer.parseInt(s1);
		while (a!=0){
			if ((a % 10) == 1) {
				k = k + 1;
			}
			else{
				k = 0;
			}
				a = a /10;
			if (k > max){
				max =k;
			}
		}
		System.out.println("Максимальное колличество единиц : "+max);
	}
		
}
