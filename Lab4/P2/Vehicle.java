package P2;

/**
 * @author Tavi
 *
 */
public class Vehicle {
	protected int capacity;
	protected String color;
	protected int topSpeed;
	
	public int getCapacity() {
		return capacity;
	}
	protected void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	protected void setTopSpeed(int topspeed) {
		this.topSpeed = topspeed;
	}
	
	public Vehicle()
	{
		this.setCapacity(0);
		this.setColor("");
		this.setTopSpeed(0);
	}
	
	public Vehicle(int capacity, String color, int topSpeed)
	{
		this.setCapacity(capacity);
		this.setColor(color);
		this.setTopSpeed(topSpeed);
	}
	
	public Vehicle(Vehicle v)
	{
		this.setCapacity(v.getCapacity());
		this.setColor(v.getColor());
		this.setTopSpeed(v.getTopSpeed());
	}
}