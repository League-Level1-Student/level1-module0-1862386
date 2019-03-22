import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTV {
public static void main(String[] args) {
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b = new JButton("Suprise");
	JLabel l = new JLabel();
	f.add(p);
	p.add(b);
	f.setVisible(true);
	f.pack();

}
}
