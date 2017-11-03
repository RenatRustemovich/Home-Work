public class Task1{
	public static void split(int[] arr, int length){
		int arrf = arr[length-1];
		int arrpf = arr[length-2];

		for (int i = 0; i < length - 2; i++) {
			arr[i+2] = arr[i];
		}
		arr[0] = arrpf;
		arr[1] = arrf;
		for(int i = 0; i < args.length; i++)
		System.out.println("arr[" + i + "]= " + arr[i]);
		System.out.println();
	}
	public static void main(String [] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
			}
		int[] arr = new int[args.length];	
		for (int i = 0; i < args.length; i++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int length = args.length;
		split(arr[] , length);
		for(int i = 0; i < args.length; i++)
		System.out.println("arr[" + i + "]= " + arr[i]);
	}
}