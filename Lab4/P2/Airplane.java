package P2;

public class Airplane extends MotorizedVehicle{
	public Airplane()
	{
		this.setCapacity(0);
		this.setColor("");
		this.setTopSpeed(0);
		this.setSpeed(0);
		this.setLocation(0,0);
	}
	
	public Airplane(int capacity, String color, int topSpeed, int speed, double lat, double lon)
	{
		this.setCapacity(capacity);
		this.setColor(color);
		this.setTopSpeed(topSpeed);
		this.setSpeed(speed);
		this.setLocation(lat, lon);
	}
	
	public Airplane(int capacity, String color, int topSpeed, int speed, Point location)
	{
		this.setCapacity(capacity);
		this.setColor(color);
		this.setTopSpeed(topSpeed);
		this.setSpeed(speed);
		this.setLocation(location);
	}
	
	public Airplane(Airplane a)
	{
		this.setCapacity(a.getCapacity());
		this.setColor(a.getColor());
		this.setTopSpeed(a.getTopSpeed());
		this.setSpeed(a.getSpeed());
		this.setLocation(a.location.getLat(), a.location.getLon());
	}
	
	public double move(Point dest, int altitude)
	{
		double l = location.distanceTo(dest);
		return (speed / (Math.asin(l/(altitude + l*l/4*altitude))* (altitude + l*l/4*altitude))); 
	}
}
