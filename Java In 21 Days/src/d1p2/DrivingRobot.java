package d1p2;

public class DrivingRobot extends Robot {

	private double speed;
	
	DrivingRobot(String name, int id, double speed) {
		super(name, id);
		this.speed = speed;
	}
	
	public String toString() {
		return "[" + super.toString() + ", Speed = " + speed + "]";
	}
	
}
