package com.chap16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
	new Jukebox5().go();
}
	class ArtistCompare implements Comparator<Song>{

		@Override
		public int compare(Song s1, Song s2) {
			// TODO Auto-generated method stub
			return s1.getArtist().compareTo(s2.getArtist());
		}
		
	}
	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
	}
	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("E:\\Swabhav Repository\\CoreJava\\codemagnet\\src\\com\\chap16\\Songlist1");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private void addSong(String lineToParse) {
		// TODO Auto-generated method stub
		String tokens[] = lineToParse.split("/");
		Song s = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(s);
	}
}
