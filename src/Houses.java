import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot rob = new Robot();

public static void main(String[] args) {
	
	rob.setX(40);
	rob.setY(580);
	rob.penDown();
	rob.setRandomPenColor();
	rob.setSpeed(100);
	for(int i = 0; i<9; i++) {
	//	int number = new Random().nextInt(400);
		
drawHouse("small");
drawHouse("medium");
drawHouse("large");
	}
}
static void drawHouse(String size) {
	int height = 40;
	if (size .equals("small")) {
		height = 60;
	}
	if (size.equals("medium")) {
		height = 120;
	}
	if (size.equals("large")) {
		height = 250;
	}
	rob.move(height);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(height);
	rob.turn(270);
	rob.move(15);
	rob.turn(-90);
}
}
