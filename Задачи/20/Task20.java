public class Task20 {
    public static void main(String args[]){
      if (args.length < 1) {
        System.err.println("Please enter correct data");}
      if (Integer.parseInt(args[0]) < 1) {
        System.err.println("Please enter correct data");}

      int n = Integer.parseInt(args[0]);
          System.out.print("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
           if ((n % i) == 0){
              System.out.print(i + " ");
            }
        }
    }
}
