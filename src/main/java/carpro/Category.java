package carpro;

public class Category {
	
	static int idSequence = 0;
	private String name;
	private int id;
	
	public Category(String name) {
		this.name = name;
		this.id = ++idSequence;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id + " _ " + name;
	}
}
