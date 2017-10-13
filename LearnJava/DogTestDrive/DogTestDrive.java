class Human {
	int size;
	String name;
	void noize(){
		System.out.println("Дискретка-а-а!");
	}
}

public class DogTestDrive{
	public static void main(String[] args) {
		Human friend = new Human();
		friend.size = 174;
		friend.name = "Ayaz";
		friend.noize();
	}
}