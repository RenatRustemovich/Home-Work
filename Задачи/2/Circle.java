import java.util.Scanner;

public class Circle{

	public static void main (String[] args){

		System.out.println("Введите радиус: ");
		Scanner in = new Scanner(System.in);
		double R  = in.nextDouble();
		double l;
		double S;
		S = Math.PI*R*R;
		l = 2*Math.PI*R;
		System.out.println("S = "+S);
		System.out.println("l ="+l);
	}

}