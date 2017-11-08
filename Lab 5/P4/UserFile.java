package P4;

import java.util.Comparator;

public class UserFile implements Comparator<UserFile> {
	private String name, ext, type;
	private double size;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public UserFile() {
		setExt("");
		setName("");
		setSize(0);
		setType("");
	}
	
	public UserFile(UserFile u) {
		setExt(u.getExt());
		setName(u.getName());
		setSize(u.getSize());
		setType(u.getType());
	}
	
	public UserFile(String name, String ext, String type, double size) {
		setName(name);
		setExt(ext);
		setSize(size);
		setType(type);
	}
	
	public int compareTo(UserFile u) {
		return compare(this, u);
	}
	
	public int compare(UserFile u1, UserFile u2) {
	      return (int) (u1.getSize() - u2.getSize());
	}
	
	public String toString() {
		return this.getName() + " " + this.getType() + " ." + this.getExt() + " " + this.getSize(); 
	}
}
