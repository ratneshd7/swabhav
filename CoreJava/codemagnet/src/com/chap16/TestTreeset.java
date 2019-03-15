package com.chap16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeset {
	ArrayList<Song2> Song2List = new ArrayList<>();

	public static void main(String[] args) {
		new TestTreeset().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSong2();
		System.out.println(Song2List);
		Collections.sort(Song2List);
		System.out.println(Song2List);
		TreeSet<Song2> songSet = new TreeSet<Song2>();
		songSet.addAll(Song2List);
		System.out.println(songSet);
	}

	private void getSong2() {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\Swabhav Repository\\CoreJava\\codemagnet\\src\\com\\chap16\\Songlist1");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong2(line);
			
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void addSong2(String lineToParse) {
		// TODO Auto-generated method stub
String tokens[]=lineToParse.split("/");
Song2 s = new Song2(tokens[0],tokens[1],tokens[2],tokens[3]);
Song2List.add(s);
	}

}

 class Song2 implements Comparable<Song2> {
	String title;
	String artist;
	String rating;
	String bpm;
	

	public Song2(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;

	}
public boolean equals(Object aSong){
	Song s = (Song) aSong;
	return getTitle().equals(s.getTitle());
}
public int hascode(){
	return title.hashCode();
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
	public int compareTo(Song2 s) {
		// TODO Auto-generated method stub
		
		return title.compareTo(s.getTitle());
	}

}


