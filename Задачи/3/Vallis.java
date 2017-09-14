import java.util.Scanner;

public class Vallis{

	public static void main (String[] args){

		System.out.println("Введите колличеств множителей: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double p = 1d;
		for (int i = 1; i <= num; i++) {
      p = p*(i*2)*(i*2)/(i*2-1)/(i*2+1);
    }
		p=p*2;
		System.out.println(p);
	}
}