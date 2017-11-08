package P3;

public class SetterGetter <T extends People> {
	public void setAge(T t, int age) {
		t.setAge(age);
	}
	
	public void setName(T t, String name) {
		t.setName(name);
	}
	
	public int getAge(T t) {
		return t.getAge();
	}
	
	public String getName(T t) {
		return t.getName();
	}
}
