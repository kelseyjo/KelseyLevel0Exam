/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		Turtle tur = new Turtle();
		
		// 3. ask the user what color they would like the tortoise to draw
		String input = JOptionPane.showInputDialog("What color would you like the tortoise to draw in?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(input.equalsIgnoreCase("blue"))
			tur.setPenColor(Color.blue);
		else if(input.equalsIgnoreCase("red"))
			tur.setPenColor(Color.red);
		else if(input.equalsIgnoreCase("green"))
			tur.setPenColor(Color.green);
		else if(input.equals("yellow"))
			tur.setPenColor(Color.yellow);
		else
				tur.setPenColor(Color.black);	
		// 2. set the pen width to 10
		tur.setPenWidth(10);
		// 1. make the tortoise draw a shape
		tur.setSpeed(10);
		for(int i = 0; i < 360; i ++)
		{
		  tur.move(1);
		  tur.turn(1);
		}
		
		}
	}






