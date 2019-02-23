import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();

	


	static void drawHouse(String size , String color) {
		int height = 40;
		if (color.equals("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		if (color.equals("green")) {
			rob.setPenColor(0, 255, 0);
		}
		if (size.equals("small")) {
			height = 60;
		}
		if (size.equals("medium")) {
			height = 120;
		}
		if (size.equals("large")) {
			height = 250;
		}
		
		rob.move(height);
		if (size.equals("small")) {
			drawPointyRoof();
		}
		if (size.equals("medium")) {
			drawPointyRoof();
		}
		if (size.equals("large")) {
			drawFlatRoof();
		}
		rob.move(height);
		rob.turn(270);
		rob.move(15);
		rob.turn(-90);
	}
	static void drawPointyRoof() {
		rob.turn(45);
		rob.move(12);
		rob.turn(90);
		rob.move(12);
		rob.turn(45);
	}
	static void drawFlatRoof() {
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
	}

public static void main(String[] args) {

	rob.setX(40);
	rob.setY(580);
	rob.penDown();
	rob.setSpeed(100);
	for (int i = 0; i < 9; i++) {
		// int number = new Random().nextInt(400);

		drawHouse("small","green");
		drawHouse("medium","blue");
		drawHouse("large","green" );
	}

}
}