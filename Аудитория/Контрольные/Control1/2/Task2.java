class Task2{
	public static void main(String[] args){
		if (args.length != 1) {
			System.err.println("Enter correct data");	
			}	
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int n = Integer.parseInt(args[0]);
		if ((n > 999999)||(n < 100000)) {
			System.err.println("Please enter correct data");
		}
		f = n%10;
		n = n/10;	
		e = n%10;
		n = n/10;
		d = n%10;
		n = n/10;
		c = n%10;
		n = n/10;
		b = n%10;
		n = n/10;
		a = n%10;
		n = n/10;
		if (a + c + e == b + d + f){
			System.out.println("Счастливый билет");
		}
		else {
			System.out.println("Не счастливый билет");
		}
	}
}