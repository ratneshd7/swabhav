package com.chap16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Jukebox3 {
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new Jukebox3().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSong();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
	}

	private void getSong() {
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
