class Movie{
	public String title;
	public String genre;
	public int raiting;
	Movie(String title, String genre, int raiting){
		this.title = title;
		this.genre = genre;
		this.raiting = raiting;
	}
	public Movie(){};
	public void play(){
		System.out.print("Play Film");
	}
}


class MovieTheatre{
	public void playFilm(Movie movie){
		System.out.println("Play " + movie.title);
	}
}

public class Movie43{
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Mask";
		one.genre = "Comedy";
		one.raiting = 5;

		Movie two = new Movie("Interstelar", "drama", 3);
		MovieTheatre spartak = new MovieTheatre();
		spartak.playFilm(one);
		System.out.println(one.title + " " + one.genre + " " + one.raiting);
		System.out.println(two.title + " " + two.genre + " " + two.raiting);	
	}
}