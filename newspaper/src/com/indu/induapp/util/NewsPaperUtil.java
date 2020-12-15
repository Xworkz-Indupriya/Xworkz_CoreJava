package com.indu.induapp.util;

//import com.indu.induapp.newspaper.NewsPaper;
import com.indu.induapp.newspaper.TheHindu;

public class NewsPaperUtil {

	public static void main(String[] args) {
		
		//NewsPaper news= new NewsPaper("banglore times",8,"english");
		TheHindu news= new TheHindu("banglore times",8,"english");
		//news.setName("vijayavani");
		//news.setPages(9);
		//news.setLanguage("kannada");
		System.out.println(news.getName()+ " " + news.getPages()+ " " + news.getLanguage());
	}
}
