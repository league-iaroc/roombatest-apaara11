package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(500,500);
		sleep(2500);
		driveDirect(2,700);
		sleep(500);
		driveDirect(0,0);
		driveDirect(500,500);
		sleep(8000);
		driveDirect(0,0);
		driveDirect(2,700);
		sleep(500);
		driveDirect(500,500);
		
	}

	public void loop() {
	
	}
}
