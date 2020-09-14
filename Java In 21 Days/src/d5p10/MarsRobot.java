package d5p10;

public class MarsRobot {

	String status;
	int speed;
	float temperature;
	
	MarsRobot(String status, int speed, float temperature) {
		this.status = status;
		this.speed = speed;
		this.temperature = temperature;
	}
	
	public void checkTemperature() {
		if (temperature < -80) {
			status = "returning home";
			speed = 5;
		}
	}
	
	public void showAttributes() {
		System.out.println("Status:  " + status);
		System.out.println("Speed:  " + speed);
		System.out.println("Temperature:  " + temperature);
	}
	
	public static void main(String[] args) {
		MarsRobot robo = new MarsRobot("active", 50, 80.5f);
		robo.showAttributes();
		/* Changing instance variables.  */
		robo.status = "in repair";
		robo.showAttributes();
		robo.speed = 60;
		robo.showAttributes();
		/* Since temperature < -80, other attributes will change too.  */
		robo.temperature = -80.5f;
		robo.checkTemperature();
		robo.showAttributes();
	}
	
}
