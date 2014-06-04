import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class HelloLabal {

	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Labal");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 200);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		label.setText("Hey!This is Different!");
	}
}
