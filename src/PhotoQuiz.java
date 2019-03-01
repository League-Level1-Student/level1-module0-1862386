/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
             String bryce = "https://cdn.vox-cdn.com/thumbor/Yjp0dLRTeivxwGYex2iBd_hMcF4=/144x144:2641x1589/1200x800/filters:focal(1219x357:1641x779)/cdn.vox-cdn.com/uploads/chorus_image/image/63146981/usa_today_11182629.0.jpg";
		// 2. create a variable of type "Component" that will hold your image
             Component image;
		// 3. use the "createImage()" method below to initialize your Component
             image = createImage(bryce);
		// 4. add the image to the quiz window
             quizWindow.add(image);
		// 5. call the pack() method on the quiz window
             quizWindow.pack();
		// 6. ask a question that relates to the image
             String harper = JOptionPane.showInputDialog("Do you like Bryce Harper?");
		// 7. print "CORRECT" if the user gave the right answer
             if (harper.equals("no")) {
            	 JOptionPane.showMessageDialog(null, "CORRECT!");
						}
		// 8. print "INCORRECT" if the answer is wrong
             else if (harper.equals("yes")) {
            	 JOptionPane.showMessageDialog(null, "INCORRECT!");			}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
            quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
            String juan ="https://cdn.vox-cdn.com/thumbor/-S-dSEvsvmTwoVhNVkClkTt35lY=/0x0:3354x2192/1200x800/filters:focal(1798x376:2334x912)/cdn.vox-cdn.com/uploads/chorus_image/image/60101635/973963856.jpg.0.jpg";
            Component picture;
            picture = createImage(juan);
		// 11. add the second image to the quiz window
            quizWindow.add(picture);
		// 12. pack the quiz window
            quizWindow.pack();
		// 13. ask another question
            String soto =JOptionPane.showInputDialog("Do you like Juan Soto");
		// 14+ check answer, say if correct or incorrect, etc.
            if (soto.equals("yes")) {
          JOptionPane.showMessageDialog(null, "CORRECT!");
            }
            else if (soto.equals("no")) {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
			}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





