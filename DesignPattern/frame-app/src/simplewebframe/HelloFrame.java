package simplewebframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloFrame extends JFrame {
	private JButton hellobutton;

	public HelloFrame() {

		// TODO Auto-generated constructor stub
		addButton();
		this.setSize(700, 440);
		this.setLayout(null);
		this.setVisible(true);

	}

	public void addButton() {

		hellobutton = new JButton("hello");

		hellobutton.setBounds(40, 40, 80, 40);
		hellobutton.setVisible(true);
		this.add(hellobutton);
		hellobutton.addActionListener(new Sms());
		hellobutton.addActionListener(new Email());

	}

}
