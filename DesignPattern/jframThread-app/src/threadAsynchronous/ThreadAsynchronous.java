package threadAsynchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ThreadAsynchronous extends JFrame implements Runnable, ActionListener {
	private JButton alert, print;

	public ThreadAsynchronous() {
		alert = new JButton("Alert");
		print = new JButton("Print");

		add(alert);
		add(print);

		alert.addActionListener(this);
		print.addActionListener(this);

		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Thread Asynchronous");
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == alert)
			
		{
			JOptionPane.showMessageDialog(this, "Alert Zone");

		}
		if (e.getSource() == print) {
			Thread t1 = new Thread(new ThreadAsynchronous());
			t1.start();

		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
 
		while(true){
			Date date=new Date();
			SimpleDateFormat formatter=new SimpleDateFormat("hh:mm:ss");
			String time=formatter.format(date);
			System.out.println(time);
		}
	}

}
