package simplewebframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int action=Integer.parseInt(e.getActionCommand());
		switch(action){
		
		case 1:System.out.println("Hello");
			break;
		case 2:System.out.println("Hii");
		    break;
		}
		/*System.out.println("hii");
		System.out.println("hello");*/
		
	}

}
