package com.epam.news.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ViewClass {

	public static void main(String[] args) {
		System.out.println("Hello");

		// test commands for admin
		Command ac = Command.FIND_NEWS;
		switch (ac) {
		case FIND_NEWS:
			break;
		
		case ADD_NEWS:
			System.out.println("HEU");
			break;
//		case SHOW_ALL_NEWS:
//			break;
//
//		case ADD_NEWS:
//			break;
//		case DELETE_NEWS:
//			break;
//		case EDIT_NEWS:
//			break;
//
//		case CREATE_USER:
//			break;
//		case BLOCK_USER:
//			break;

		default:
			// some comments
		}
	}
}
