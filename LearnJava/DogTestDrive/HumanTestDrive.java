class Human {
	public int heigth;
	public String name;
	}
	public String getName(){
		return name;
	}
	
}

public class HumanTestDrive{
	public static void main(String[] args) {
		Human friend = new Human();
		friend.heigth = 174;
		friend.name = "Ayaz";
		friend.noize();
	}
}