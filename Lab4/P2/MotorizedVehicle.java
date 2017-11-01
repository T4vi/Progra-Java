package P2;

public class MotorizedVehicle extends Vehicle {
	protected int speed;
	protected Point location;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = new Point(location);
	}
	public void setLocation(double lat, double lon) {
		this.location = new Point(lat,lon);
	}
	
	public MotorizedVehicle()
	{
		this.setCapacity(0);
		this.setColor("");
		this.setTopSpeed(0);
		this.setSpeed(0);
		this.setLocation(0,0);
	}
	
	public MotorizedVehicle(int capacity, String color, int topSpeed, int speed, double lat, double lon)
	{
		this.setCapacity(capacity);
		this.setColor(color);
		this.setTopSpeed(topSpeed);
		this.setSpeed(speed);
		this.setLocation(lat, lon);
	}
	
	public MotorizedVehicle(int capacity, String color, int topSpeed, int speed, Point location)
	{
		this.setCapacity(capacity);
		this.setColor(color);
		this.setTopSpeed(topSpeed);
		this.setSpeed(speed);
		this.setLocation(location);
	}
	
	public MotorizedVehicle(MotorizedVehicle mv)
	{
		this.setCapacity(mv.getCapacity());
		this.setColor(mv.getColor());
		this.setTopSpeed(mv.getTopSpeed());
		this.setSpeed(mv.getSpeed());
		this.setLocation(mv.location.getLat(), mv.location.getLon());
	}

	public double move(Point dest)
	{
		return ((double)speed / location.distanceTo(dest)); 
	}
}
