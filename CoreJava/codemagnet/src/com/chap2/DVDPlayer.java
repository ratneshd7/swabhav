package com.chap2;

class DVDPlayerTestDrive {
boolean canRecord = false;
void recordDVD() {
System.out.println("DVD recording");
}
}
class DVDPlayer {
public static void main(String [] args) {
	DVDPlayerTestDrive d = new DVDPlayerTestDrive();
d.canRecord = true;

if (d.canRecord == true) {
d.recordDVD();
}
}
}
