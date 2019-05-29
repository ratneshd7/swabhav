package com.techlabs.bookmark;

import java.util.Scanner;

public class BookmarkTest {
	final static private int ADD_BOOKMARK = 1;
	final static private int EXPORT_BOOKMARK = 2;
	final static private int DELETE_BOOKMARK = 3;
	final static private int DISPLAY_BOOKMARK = 4;
	final static private int IMPORT_BOOKMARK = 5;
	final static private int EXIT = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;

		BookmarkManager manager = new BookmarkManager();
		while (ch != (EXIT)) {
			System.out.println(
					"\n Enter your choice \n1:Add Bookmarks \n2:Export Bookmark \n3:Delete Bookmark\n4:Display Bookmark \n5:Import Bookmark \n6:Exit ");
			ch = sc.nextInt();
			switch (ch) {
			case ADD_BOOKMARK:
				System.out.println("Enter Bookmark name");
				String name = sc.next();
				System.out.println("Enter Bookmark Url");
				String description = sc.next();
				manager.addBookmark(name, description);
				break;
			case EXPORT_BOOKMARK:
				manager.export();
				break;
			case DISPLAY_BOOKMARK:
				manager.display();
				break;
			case IMPORT_BOOKMARK:
				 manager.import1();
				break;
			case EXIT:
				break;
			}
		}

		/*
		 * manager.addBookmark("Google", "https://www.google.com");
		 * manager.addBookmark("Facebook", "https://www.facebook.com");
		 * manager.addBookmark("Amazon", "https://www.amazon.com");
		 * 
		 * manager.export(); manager.display();
		 * 
		 * manager.deletBookmark("Amazon"); manager.export(); manager.display();
		 */
	}
}
