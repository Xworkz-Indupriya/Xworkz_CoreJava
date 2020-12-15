package com.indu.induapp.newspaper;

public class NewsPaper {

	/*public String name;
	public int pages;
	public String language;
	*/
	
	private String name;
	private int pages;
	private String language;
	
	public NewsPaper(String name, int pages, String language) {
		this.name=name;
		this.pages=pages;
		this.language=language;
	}

	
	public NewsPaper() {
		
	}


	public String newsPaper() {
		return "news";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

		
	
}
