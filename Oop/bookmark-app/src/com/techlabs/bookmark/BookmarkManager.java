package com.techlabs.bookmark;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookmarkManager {

	ArrayList<Bookmark> list = new ArrayList<>();

	public void addBookmark(String name, String description) {
		Bookmark bookmark = new Bookmark(name, description);
		list.add(bookmark);

	}

	public void deletBookmark(String name) {
		for (Bookmark bookmark : list) {

			int i = 0;
			if (bookmark.getUrl_name().equals(name)) {
				i = list.indexOf(bookmark);
				list.remove(i);
				break;
			}
		}
	}

	public void export() {
		try {
			FileOutputStream fs = new FileOutputStream("DataFile\\Bookmarks.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(list);
			os.close();

			String html;
			html = "<html><head><title>Simple Page</title></head><body><ul>";
			for (Bookmark bookmark2 : list) {
				html += "<li> <a href=\"" + bookmark2.getUrl_description() + "\" >" + bookmark2.getUrl_name()
						+ "</a></li>";
			}
			html = html + "</ul></body></html>";

			File file = new File("DataFile\\Bookmark.html");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(html);
			fileWriter.close();

			File f = new File("DataFile\\Bookmark.html");
			Desktop.getDesktop().browse(f.toURI());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display() {
		try {
			FileInputStream fis = new FileInputStream("DataFile\\Bookmarks.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ArrayList<Bookmark> arrobj = (ArrayList<Bookmark>) obj;

			/**/
			for (Bookmark bookmark : arrobj) {
				printDetails(bookmark);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printDetails(Bookmark bookmark) {
		// TODO Auto-generated method stub
		System.out.println("url_name:" + bookmark.getUrl_name() + "url_description:" + bookmark.getUrl_description());
	}
	public void import1() {
		try{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DataFile\\Bookmarks.ser"));
			ArrayList<Bookmark> savedBookmarks=(ArrayList<Bookmark>) ois.readObject();
		list=savedBookmarks;
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

