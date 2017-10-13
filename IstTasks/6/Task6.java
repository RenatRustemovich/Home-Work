public class Task6{
	public static void main (String [] args){
		double S = 1;
		double S1 = 1;
		double a = 0;
		double E = 0;
		int n = Integer.parseInt(args[0]);
		if (n<1){
			System.err.println("Please enter correct data");
			System.exit(1);
		}
		else {
			for (int i = 1; i <= n; i++){
				int m = i;
				for (int k = 1; k <= m-1; k++){                            //Подсет числителя для нового m
					S=S*k;
					}
				S=S*S;
				for (int k = 1; k <= 2*m; k++){
					S1 = S1*k;
				}

				a = S/S1;
				E = E+a;

				S = 1;
				S1 = 1;
			}
		}
		System.out.println(E);
	}	
}
