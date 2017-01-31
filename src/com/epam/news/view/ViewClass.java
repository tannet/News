package com.epam.news.view;

import com.epam.news.view.Actions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ViewClass {

	public static void main(String[] args) {
		System.out.println("Hello");

		// test commands
		Command ac = Command.FIND_NEWS;
		switch (ac) {
		case FIND_NEWS:
			findNews(ac);
			break;
		case ADD_NEWS:
			addNews();
			break;
		case SHOW_ALL_NEWS:
			break;
		default:
			// some comments
		}

		
		// test commands for finds
		FindCommand fc = FindCommand.FIND_BY_GENRE;
		switch (fc) {
		case FIND_BY_TITLE:
			break;
		case FIND_BY_YEAR:
			break;
		case FIND_BY_GENRE:
			break;
		case FIND_BY_PRICE:
			break;
		default:
			// some comments
		}
	}

	private static void findNews(Command ac) {
		// TODO Auto-generated method stub
		
	}

	//// SOME METHODS TO RUN THE CODE
	private static void addNews() {
		// TODO Auto-generated method stub
		
	}
}
