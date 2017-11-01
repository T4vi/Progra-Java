package P2;

public class mainclass {

	public static void main(String[] args) {
		
		MotorizedVehicle Adacumasina = new MotorizedVehicle(100, "negru", 100, 100, new Point(0, 0));
		double catiiia = Adacumasina.move(new Point(10,10));
		System.out.println(catiiia);
	}

}
