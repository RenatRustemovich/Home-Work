public class Triangle {
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		if(n < 3){
			System.err.println("Please enter correct data");
		}
		if (n % 2 == 0){
			System.err.println("Please enter correct data");
		} else{
			for (int i = 1; i <= n ; i+=2) {
			for (int k = (n-i)/2 ; k >= 0; k--) {
				System.out.print(" ");}
			for (int k = i; k > 0 ; k-- ) {
				System.out.print('*');	
			}
			System.out.println();
		  }
				
		}
			
	}
		
}
