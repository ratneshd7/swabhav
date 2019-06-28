package threadSynchronoustest;

import javax.swing.JFrame;

import threadSynchronous.ThreadSynchronous;

public class ThreadSynchronousTest {
	public static void main(String[] args) {
		ThreadSynchronous synchronous = new ThreadSynchronous();
		synchronous.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
