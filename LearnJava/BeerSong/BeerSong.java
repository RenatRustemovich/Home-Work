public class BeerSong{
	public static void main(String[] args) {
		int n = 99;
		String word = "бутылки(бутылок)";
		while (n > 1){
			System.out.println(n + " бутылок пива на стене");
			System.out.println(n + " бутылок пива");
			System.out.println("Возьми одну, пусти по кругу");
			n--;
			System.out.println(n + " бутылок пива на стене");	
		}
		System.out.println(n + " бутылка пива на стене");
		System.out.println(n + " бутылка пива");
		System.out.println("Возьми одну, пусти по кругу");
		n--;
		System.out.println("Нет бутылок пива на стене");	
	}		
}
