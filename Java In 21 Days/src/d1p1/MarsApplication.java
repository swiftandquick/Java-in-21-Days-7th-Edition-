package d1p1;

public class MarsApplication {

	public static void main(String[] args) {
		System.out.println("Spirit 1:  ");
		MarsRobot spirit = new MarsRobot("exploring", 2, -60);
		spirit.checkTemperature();
		spirit.showAttribute();

		System.out.println("Spirit 2:  ");
		MarsRobot spirit2 = new MarsRobot();
		spirit2.setTemperature(-90);
		spirit2.checkTemperature();
		spirit2.showAttribute();
	}
	
}
