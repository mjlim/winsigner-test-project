package MavenProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame{
	/**
	 * Default
	 */
	private static final long serialVersionUID = 1L;

	public GUI(){
		super();
		setSize(400,400);
		JPanel temp = new JPanel();
		temp.add(new JLabel("Hello World!"));
		add(temp);
		setVisible(true);
	}
}
