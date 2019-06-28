package simplewebframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoBtnOneListner extends JFrame {

	public TwoBtnOneListner() {
		 JButton btnOne = new JButton("Hello");
	     JButton btnTwo = new JButton("Hii");
	     this.setSize(500, 300);
	     this.setTitle("Ratnesh");
	     btnOne.setBounds(40, 40, 80, 30);
	     btnTwo.setBounds(180, 40, 80, 30);
	     this.setLayout(null);
	     this.setVisible(true);
	     this.add(btnOne);
	     this.add(btnTwo);
	     OneListner oneListner=new OneListner();
	     btnOne.addActionListener(oneListner);
	     btnTwo.addActionListener(oneListner);
	     
	     btnOne.setActionCommand("1");
	     btnTwo.setActionCommand("2");
	}
	
}
