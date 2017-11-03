public class Task1{
	public static final double g = 9.8;
	public static double heightOfwell(double t){
		return(g*t*t/2);
	}
	public static void main (String [] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			}
			else {
			  	double t = Double.parseDouble(args[0]);
				if (t<0){
					System.err.println("Please try again");
				}
					else {
						System.out.println(heightOfwell(t));
					}
			}
	}
}