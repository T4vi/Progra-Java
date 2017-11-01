package P2;

// this can be either Latitude or Longitude
public class GeoLoc {
	private double coord;

	public double getCoord() {
		return coord;
	}
	public void setCoord(double coord) {
		this.coord = coord;
	}
	
	public GeoLoc() {
		setCoord(0);
	}
	public GeoLoc(double c) {
		setCoord(c);
	}
	public GeoLoc(GeoLoc g) {
		setCoord(g.getCoord());
	}
}

class Point
{
	private GeoLoc lat = new GeoLoc();
	private GeoLoc lon = new GeoLoc();
	
	public double getLat() {
		return lat.getCoord();
	}
	public void setLat(double lat) {
		this.lat.setCoord(lat);
	}
	public double getLon() {
		return lon.getCoord();
	}
	public void setLon(double lon) {
		this.lon.setCoord(lon);
	}
	
	public void setLocation(double lat, double lon) {
		this.setLat(lat);
		this.setLon(lon);
	}
	
	public void setLocation(Point p) {
		this.setLat(p.getLat());
		this.setLon(p.getLon());
	}
	
	public Point() {
		this.setLocation(0,0);
	}
	
	public Point(double lat, double lon) {
		this.setLocation(lat, lon);
	}	
	
	public Point(Point p) {
		this.setLocation(p.getLat(), p.getLon());
	}
	
	public String toString() {
		return "LAT: " + lat.getCoord() + " LONG: " + lon.getCoord();
	}
	
	public double distanceTo(Point b) {
		return Math.sqrt(Math.pow(this.getLat() - b.getLat(), 2) + Math.pow(this.getLon() - b.getLon(), 2));
	}
}