public class Task7 {
	public static void main(String [] args){
		double S = 0;
		double m = 1;
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				S = S + (-1.0)/(m*m);}
			else {
				S = S + 1.0/(m*m);}	
			m = m + 2;
		}
	System.out.println(S);
	}
}