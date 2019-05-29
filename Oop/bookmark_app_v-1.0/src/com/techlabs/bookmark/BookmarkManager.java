package com.techlabs.bookmark;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookmarkManager {

	ArrayList<Bookmark> bookmarks = new ArrayList<Bookmark>();

	public void addBookMarks(String name, String link) {
		Bookmark bookmark=new Bookmark(name,link);
		bookmarks.add(bookmark);
	}

	public void deleteBookMarks(String name) {
		int bookmarkIndex=(-1);
		for (Bookmark bookmark : bookmarks) {
			if(bookmark.getUrl_name().equalsIgnoreCase(name)) {
			 	bookmarkIndex= bookmarks.indexOf(bookmark);
			}
		}
		if(bookmarkIndex==(-1)) {
			System.out.println("Bookmark not found");
		}else {
			bookmarks.remove(bookmarkIndex);
		}
		
	}

	public void exportBookMarks() {
		try {
			FileOutputStream fs=new FileOutputStream("DataFile\\Bookmarks.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(bookmarks);
			os.close();
			String htmlData="<!DOCTYPE html>\n<html>\n<body>\n<h2>Saved Bookmarks</h2>\n<ul style=\"list-style-type:none;\">\n";
			for (Bookmark bookmark : bookmarks) {
				String str="\n<li><a href=\"https://"+bookmark.getUrl_description()+"\">"+bookmark.getUrl_name()+"</a></li>";
				htmlData=htmlData+str;
			}
			htmlData=htmlData+"</ul>\n</body>\n</html>";
			FileWriter fw=new FileWriter("DataFile\\Bookmarks.html");
			fw.write(htmlData);
			fw.close();

			File file = new File("DataFile\\Bookmarks.html");
			Desktop.getDesktop().browse(file.toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void importBookMarks() {
		try {
			ObjectInputStream is=new ObjectInputStream(new FileInputStream("DataFile\\Bookmarks.ser"));
			ArrayList<Bookmark> savedBookmarks=(ArrayList<Bookmark>) is.readObject();
			bookmarks=savedBookmarks;
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayBookMarks() {
		try {
//			ObjectInputStream is=new ObjectInputStream(new FileInputStream("Bookmarks.ser"));
//			ArrayList<Bookmark> savedBookmarks=(ArrayList<Bookmark>) is.readObject();
			for (Bookmark bookmark : bookmarks) {
				System.out.println("Name : " +bookmark.getUrl_name()+ "\nBookmarks : "+bookmark.getUrl_description());
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

