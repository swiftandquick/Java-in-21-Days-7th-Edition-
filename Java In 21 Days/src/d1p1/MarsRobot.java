package d1p1;

public class MarsRobot {

	private String status;
	private int speed;
	private float temperature;
	
	MarsRobot() {
		// Do nothing.  
	}
	
	MarsRobot(String status, int speed, float temperature) {
		this.status = status;
		this.speed = speed;
		this.temperature = temperature;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public void checkTemperature() {
		if (temperature < -80) {
			status = "returning home";
			speed = 5;
		}
	}
	
	public void showAttribute() {
		System.out.println("Status:  " + status);
		System.out.println("Speed:  " + speed);
		System.out.println("Temperature:  " + temperature);
	}
	
}
