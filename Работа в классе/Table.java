public class Table{

	public static void main (String [] args){

		int i = 0;
		int k = 0;
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			} 
			else{
				int num=Integer.parseInt(args[0]);
				for (i=1;i<=num; i++){
					System.out.println();
					for(k=1; k<=num; k++){
						System.out.printf("%4d",i*k);

					}
				}
			}
		if (i==1){System.out.println("Please enter correct data");
		}
	}

}