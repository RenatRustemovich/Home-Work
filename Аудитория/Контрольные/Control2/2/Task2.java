public class Task2{
	public static String join(int[] nums, char symbol, int length){
		String s = "";
		for (int i = 0; i < length; i++ ) {
			s = s + nums[i];
			if (i != length-1) {
				s = s + symbol;
			}
		}
		return(s);
	}
	public static void main(String [] args){
		if (args.length < 1){
			System.err.println("Please enter data");
			System.exit(1);
		}
		int[] arr = new int[args.length];
		int l = args.length;
		for (int i = 0; i < l; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println(join(arr, '*', l));
	}
}