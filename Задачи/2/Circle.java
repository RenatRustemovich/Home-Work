import java.util.Scanner;

public class Vallis{

	public static void main (String[] args){

		System.out.println("Введите колличеств множителей: ");
		Scanner in = new Scanner(System.in);
		Int num = in.nextInt();
		double pi = 1;
		for (int i = 1; i <= num; i++) {
      		pi = (pi*(i*2)*(i*2))\((i*2-1)*(i*2+1));
    		}
		
		System.out.println("Число ПИ: "+pi);
	}
}