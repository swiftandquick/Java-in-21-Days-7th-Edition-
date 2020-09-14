package d1p2;

public class RobotDemo {

	public static void main(String args[]) {
		
		Robot v1 = new Robot("Zeus", 1500);
		Robot v2 = new WalkingRobot("Artemis", 2200, "Body Slam");
		Robot v3 = new DrivingRobot("Hercules", 3250, 42.63);
		DrivingRobot opportunity = new DrivingRobot("Opportunity", 3300, 42.67);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(opportunity);
				
	}
	
}
