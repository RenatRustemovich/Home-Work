
public class Vallis{

	public static void main (String[] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			} else

		System.out.println("Введите колличеств множителей: ");
	
		int num = Integer.parseInt(args[0]);
		double p = 1d;
		for (int i = 1; i <= num; i++) {
      		p = p*(i*2)*(i*2)/(i*2-1)/(i*2+1);
    		}
		p=p*2;
		System.out.println(p);
	}
}