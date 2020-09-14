package d1p2;

public class Robot {

	private String name; 
	private int id; 
	
	Robot(String name, int id) {
		this.name = name; 
		this.id = id;
	}
	
	public String toString() {
		return "[Name = " + name + ", ID = " + id + "]";
	}
	
}
