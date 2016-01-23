/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main (String[] args)
	{
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		int year = 2016;
		System.out.println("You were born in the year of "+ (year-age));
		if(age>30)
			System.out.println("You are too old to play this game!");
	}

}