package com.chap16;

public class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;

	public Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;

	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpn() {
		return bpm;
	}
	public String toString() {
		return title;
		}
	@Override
	public int compareTo(Song s) {
		// TODO Auto-generated method stub
		
		return title.compareTo(s.getTitle());
	}

}
