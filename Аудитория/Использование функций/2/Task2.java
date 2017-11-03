public class Task2{
	public static double area(double r){
		return(Math.PI*r*r);
	}
	public static double length(double r){
		return(2*Math.PI*r);
	}
	public static void main (String[] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			} 
			else {
				double r  = Double.parseDouble(args[0]);
				System.out.println("S = " + area(r));
				System.out.println("l = " + length(r));
			}

	}
}