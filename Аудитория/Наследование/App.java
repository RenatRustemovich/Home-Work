
// Родительский класс Vehicle
class Vehicle{
	int countOfWheels;
	String title;
	Vehicle(String title, int countOfWheels){
		this.title = title;
		this.countOfWheels = countOfWheels;
	}
	void beep(){
		System.out.println("Beep from Vehicle");
	}
	String getTitle(){
		return(title);
	}
	int getCountOfWheels(){
		return(countOfWheels);
	}
}

// Потомок, класс Car
class Car extends Vehicle{
	Car(String title, int countOfWheels){
		super(title, countOfWheels);
	}
	void glassOn(){
		System.out.println("Стекла подняты");
	}
	void glassOff(){
		System.out.println("Стекла опущены");
	}
}

public class App{
	public static void main(String[] args) {
		Vehicle mazda = new Car(mazda, 4);
		mazda.beep();
		System.out.println(mazda.getTitle());
		System.out.println(mazda.getCountOfWheels());
	}
}

