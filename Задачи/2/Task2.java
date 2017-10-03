
public class Task2{

	public static void main (String[] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			} 
			else {
				System.out.println("Введите радиус: ");
				double R  = Double.parseDouble(args[0]);
				double l;
				double S;
				S = Math.PI*R*R;
				l = 2*Math.PI*R;
				System.out.println("S = "+S);
				System.out.println("l = "+l);
			}

	}
}