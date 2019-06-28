package threadSynchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Alert implements ActionListener {
	static JDialog d;

	@Override
	public void actionPerformed(ActionEvent e) {
		

		JFrame f = new JFrame();
		d = new JDialog(f, "Alert", true);
		d.setLayout(new FlowLayout());
		JButton b = new JButton("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alert.d.setVisible(false);
			}
		});
		d.add(new JLabel("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);

	}
/*
	@Override
	public void run() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		d = new JDialog(f, "Alert", true);
		d.setLayout(new FlowLayout());
		JButton b = new JButton("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alert.d.setVisible(false);
			}
		});
		d.add(new JLabel("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);


	}
*/
}
