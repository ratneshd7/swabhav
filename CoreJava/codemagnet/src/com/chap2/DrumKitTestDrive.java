package com.chap2;

public class DrumKitTestDrive {
public static void main(String[] args) {

	Drumkit d=new Drumkit();
	if (d.snare == true) {
		d.playSnare();
		}
	d.playTopHat();
	
}
}
class Drumkit{
	boolean topHat = true;
	boolean snare = true;
	public void playTopHat() {
		// TODO Auto-generated method stub
		System.out.println("ding ding da-ding");
		
	}
	public void playSnare() {
		// TODO Auto-generated method stub
		System.out.println("bang bang ba-bang");
		
	}
	
}
