

public class Colodec{

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
						double h;
						double g = 9.8f;
						h = g*t*t/2;
						System.out.println(h);	
					}
				}
	}
}