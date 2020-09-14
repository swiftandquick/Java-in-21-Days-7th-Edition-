package d1p2;

public class WalkingRobot extends Robot {

	String ability;
	
	WalkingRobot(String name, int id, String ability) {
		super(name, id);
		this.ability = ability;
	}
	
	public String toString() {
		return "[" + super.toString() + ", Ability = " + ability + "]";
	}
	
}
