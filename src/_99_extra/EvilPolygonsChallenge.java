package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.setY(600);
		//1. Create a new Robot

		//2. Set the speed to 100

		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		String color = String.valueOf(colorChoice);
		if (color.equalsIgnoreCase("0")){
			rob.setPenColor(255,0,0);
		}
		else if (color.equalsIgnoreCase("1")) {
			rob.setPenColor(0,255,0);
		}
		else if (color.equalsIgnoreCase("2")) {
			rob.setPenColor(0,0,255);
		}
		drawPolygon(rob);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
public static void drawPolygon(Robot rob) {
	String Poly = JOptionPane.showInputDialog("How many polygons do you want?");
	int Polygons = Integer.parseInt(Poly);
	for (int i = 0; i < Polygons; i++) {
		rob.penDown();
		for (int j = 0; j <= 3; j++) {
		rob.move(25);
		rob.turn(90);
		}
		rob.penUp();
		rob.move(30);
	}
	rob.hide();
}
}

