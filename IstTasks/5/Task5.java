class Task5{
public static void main (String[] args) {
	if (args.length < 2) {
		System.err.println("Please enter correct numbers");
		double temp = Double.parseDouble(args[0]);
		if (temp < 0){
			System.err.println("Please enter correct numbers");
			}
		System.exit(-1);
	}
	double x = Double.parseDouble(args[1]);
	double k = Double.parseDouble(args[0]);
	double summ = 0;
	k++;
	for (double i = k - 1; i > 0; i--) {
		summ = x / ( summ + k);
		k--;
	}
	System.out.println(++summ);
}
}
