package threadSynchronous;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreadSynchronous extends JFrame {
	public ThreadSynchronous() {
		// TODO Auto-generated constructor stub
	
	JButton btnOne = new JButton("Alert");
    JButton btnTwo = new JButton("Print");
    this.setSize(500, 300);
    this.setTitle("Ratnesh");
    btnOne.setBounds(40, 40, 80, 30);
    btnTwo.setBounds(180, 40, 80, 30);
    this.setLayout(null);
    this.setVisible(true);
    this.add(btnOne);
    this.add(btnTwo);
    Alert alert = new Alert();
    Print print=new Print();
    
    btnOne.addActionListener(alert);
   
    btnTwo.addActionListener(print);
  
	}

}
