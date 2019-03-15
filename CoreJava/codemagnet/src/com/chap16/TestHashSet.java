package com.chap16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestHashSet {
	ArrayList<Song1> Song1List = new ArrayList<>();

	public static void main(String[] args) {
		new TestHashSet().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSong1();
		System.out.println(Song1List);
		Collections.sort(Song1List);
		System.out.println(Song1List);
		HashSet<Song1> Song1Set = new HashSet<Song1>();
		Song1Set.addAll(Song1List);
		System.out.println(Song1Set);
	}

	private void getSong1() {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\Swabhav Repository\\CoreJava\\codemagnet\\src\\com\\chap16\\Songlist1");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong1(line);
			
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void addSong1(String lineToParse) {
		// TODO Auto-generated method stub
String tokens[]=lineToParse.split("/");
Song1 s = new Song1(tokens[0],tokens[1],tokens[2],tokens[3]);
Song1List.add(s);
	}

}

 class Song1 implements Comparable<Song1> {
	String title;
	String artist;
	String rating;
	String bpm;
	

	public Song1(String t, String a, String r, String b) {
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
	public int compareTo(Song1 s) {
		// TODO Auto-generated method stub
		
		return title.compareTo(s.getTitle());
	}

}

