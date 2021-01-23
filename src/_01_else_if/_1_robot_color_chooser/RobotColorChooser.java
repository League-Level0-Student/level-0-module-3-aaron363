
package _01_else_if._1_robot_color_chooser;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(10);
		for(int i = 0; i < 10; i++) {
			String user = JOptionPane.showInputDialog("What color pen should robot draw with?");
			if(user.equals("red")){
				rob.setPenColor(255, 0, 0);
			}else if(user.equals("blue")) {
				rob.setPenColor(0, 0, 255);
			}else if(user.contentEquals("green")) {
				rob.setPenColor(0, 255, 0);
			}else {
				rob.setPenColor(0, 200, 200);
			}
			
			for(int j = 0; j < 4; j++) {
				rob.move(125);
				rob.turn(90);
			}
		}
		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
