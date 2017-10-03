public class Task21 {
	public static void main(String [] args){
		if (args.length < 2) {
        	System.err.println("Please enter correct data");}
     	if ( (Integer.parseInt(args[0]) < 1)||( (Integer.parseInt(args[1]) < 1) )) {
       		System.err.println("Please enter correct data");}
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        int mult = a * b; 
        while (a*b != 0){ 
        	if (a > b){ 
        		a = a % b; 
       		} 
			else { 
			b = b % a; 
			} 
		}
		System.out.println(mult / (a + b)); 
	}
}