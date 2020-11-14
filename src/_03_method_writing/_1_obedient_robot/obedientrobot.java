package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {

	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.show();
		rob.penDown();
		rob.setSpeed(50);
		String color = JOptionPane.showInputDialog("What color would you like to color the shape with? (Red, Blue, Green");
		if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(255,0,0);
		}
		else if (color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(0,255,0);
		}
		else if (color.equalsIgnoreCase("Green")) {
			rob.setPenColor(0,0,255);
		}
		String output = JOptionPane.showInputDialog("What would you like to draw? (Square, Triangle, or Circle)");
		if (output.equalsIgnoreCase("Square")) {
			drawSquare(rob);
		}
		else if (output.equalsIgnoreCase("Triangle")) {
			drawTriangle(rob);
		}
		else if (output.equalsIgnoreCase("Circle")) {
			drawCircle(rob);
		}
	
		rob.hide();
	}



	private static void drawCircle(Robot rob) {
		for(int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		
		}
	}



	public static void drawSquare(Robot rob) {
		for (int i = 0; i < 4; i++) {
			rob.move(40);
			rob.turn(90);
		}
	}

	public static void drawTriangle(Robot rob) {
		rob.move(40);
		rob.turn(135);
		rob.move(40);
		rob.turn(135);
		rob.move(40);
	}
}
