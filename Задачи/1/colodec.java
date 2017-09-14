import java.util.Scanner;

public class colodec{

	public static void main (String [] args){

		Scanner in = new Scanner(System.in);
		double h;
		double g = 9.8f;
		double t = in.nextDouble();
		h = g*t*t/2;
		System.out.println(h);
	}
}