public class Task22{
	public static void main(String [] args){
		if ((args.length != 2)||(Integer.parseInt(args[0]) < 1)||(Integer.parseInt(args[1]) < 1)){
			System.err.println("Please Enter correct datas");
		}
		int a,b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		while (a*b != 0){ 
        	if (a > b){ 
        		a = a % b; 
       		} 
			else { 
			b = b % a; 
			} 
		}
		System.out.println(a + b);

		//Алгоритм перебора
		int c = 0;
		if (a < b){
				c = a;
				a = b;
				b = c;
				c = 0;
		}
		int n = b;
		while(c == 0){
				
				if ((a % n == 0)&&(b % n == 0)) {
					c = n;
					break;
				}
				n--;
		}
		System.out.println(c);		
	}
}