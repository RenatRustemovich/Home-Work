public class Task9 {
	public static void main(String [] args){
		if(args.length < 5){
			System.err.println("Please enter datas correctly");
		}
		double Xc = Double.parseDouble(args[0]); // X центра круга
		double Yc = Double.parseDouble(args[1]); // Y ентра круга
		double r = Double.parseDouble(args[2]); // Радиус круга
		double x = Double.parseDouble(args[3]); // Координата X точки
		double y = Double.parseDouble(args[4]); // Координата Y точки
		if ((Xc-x)*(Xc-x) + (Yc-y)*(Yc-y) == r*r){
			System.out.println("Точка лежит на круге");
		}
		else {
			System.out.println("Точка НЕ лежит на круге");
		}
	}
}