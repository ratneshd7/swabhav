package com.techlabs.bookmark;

import java.io.Serializable;

public class Bookmark implements Serializable {
	private String url_name;
	private String url_description;

	public Bookmark(String name, String description) {
		// TODO Auto-generated constructor stub
		this.url_name=name;
		this.url_description=description;
		
	}
	public String getUrl_description() {
		return url_description;
	}
	public String getUrl_name() {
		return url_name;
	}

}
