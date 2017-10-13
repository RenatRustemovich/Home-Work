class Movie{
	String title;
	String genre;
	int raiting;
	Movie(String title, String genre, int raiting){
		this.title = title;
		this.genre = genre;
		this.raiting = raiting;
	}
	Movie(){};
	void Play(){
		System.out.print("Play Film");
	}
}

public class MovieTestDrive{
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Mask";
		one.genre = "Comedy";
		one.raiting = 5;

		Movie two = new Movie("Interstelar", "drama", 3);

		System.out.println(one.title + " " + one.genre + " " + one.raiting);
		System.out.println(two.title + " " + two.genre + " " + two.raiting);
		one.Play();
	}
}