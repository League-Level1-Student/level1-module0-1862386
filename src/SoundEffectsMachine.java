import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine {
public static void main(String[] args) {
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b = new JButton("Effects");
	JLabel l = new JLabel();
	f.add(p);
	p.add(b);
	f.setVisible(true);
	f.pack();
	f.add(p);
}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}

