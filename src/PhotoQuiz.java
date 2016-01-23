 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int ctr = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String url = "http://images2.wikia.nocookie.net/__cb20110210142733/recipes/images/d/db/Packham_pear.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component pic;
		// 3. use the "createImage()" method below to initialize your Component
		pic = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(pic);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("what fruit is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("pear"))
		{
			System.out.println("CORRECT");
			ctr++;
		}
		
		else
			System.out.println("INCORRECT");
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(pic);
		// 10. find another image and create it (might take more than one line of code)
		url = "https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg";
		// 11. add the second image to the quiz window
		pic = createImage(url);
		quizWindow.add(pic);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		question = JOptionPane.showInputDialog("what fruit is this?");
		if(question.equalsIgnoreCase("strawberry"))
		{
			System.out.println("CORRECT");
			ctr++;
		}
		else
			System.out.println("INCORRECT");
		// 14+ check answer, say if correct or incorrect, etc.
		if(ctr ==1)
			System.out.println("You got "+ ctr + " question correct.");
		else
			System.out.println("You got "+ ctr + " questions correct.");

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





