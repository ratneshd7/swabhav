package threadSynchronous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Print implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread queryThread = new Thread() {
			public void run() {
				for (int i = 0;; i++) {
					System.out.println(LocalTime.now());
				}
			}
		};
		queryThread.start();

		// use make thread synchronous.
		try {
			queryThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
