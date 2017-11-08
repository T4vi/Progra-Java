package P3;

public abstract class People {
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void talk();
	
}

class Kid extends People
{
	public void talk() {
		System.out.println("I'm just kid!");
	}
	
	Kid() {
		setName("");
		setAge(0);
	}
	
	Kid(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	Kid(Kid k) {
		setName(k.getName());
		setAge(k.getAge());
	}
}

class Adult extends People
{
	public void talk() {
		System.out.println("Responsible adult");
	}
	
	Adult() {
		setName("");
		setAge(0);
	}
	
	Adult(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	Adult(Adult a) {
		setName(a.getName());
		setAge(a.getAge());
	}
}

class Retired extends People
{
	public void talk() {
		System.out.println("Life was good");
	}
	
	Retired() {
		setName("");
		setAge(0);
	}
	
	Retired(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	Retired(Retired r) {
		setName(r.getName());
		setAge(r.getAge());
	}
}
