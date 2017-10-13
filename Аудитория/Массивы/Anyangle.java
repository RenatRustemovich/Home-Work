public class Anyangle{
	public static void main(String [] args){
		if(args.length < 3){
			System.err.println("Please enter much datas");
		}
		int p = 0;
		int n = args.length;
		int[] arr = new int[n];
		for (int i = 0; i <= n-1; i++){
			arr[i] = Integer.parseInt(args[i]);
			p = p + arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("P = "+p);
	}
}