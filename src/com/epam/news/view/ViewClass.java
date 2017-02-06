package com.epam.news.view;

import java.util.Map;
import java.util.Scanner;

import com.epam.news.controller.Controller;
import com.epam.news.controller.exception.ControllerException;

public class ViewClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//StartHelper.printHelper();
		
		Map<String, String> request = Actions.readRequest(sc);
		//Actions.printRequest(request);
		try {
			Controller.request(request);
		} catch (ControllerException e) {
			System.out.println("ERRRRRRRR");
			e.printStackTrace();
		}
	}
}





// Actions a = new Actions();
//
// switch (com) {
// case "ADD":
// String entityToAdd = Actions.readNewsToAdd(sc);
// //Actions.initializeNewsToAdd(entityToAdd);
// Actions.sendNewsToConroller(entityToAdd);
// break;
// case "FIND":
// Actions.readNewsToFind(sc);
// break;
// default:
// // some comments
// }

// switch (ac) {
// case FIND_NEWS:
// findNews(ac);
// break;
// case ADD_NEWS:
// // addNews();
// initializeNewsToAdd(addNews(sc));
// break;
// case SHOW_ALL_NEWS:
// break;
// default:
// // some comments
// }

// // test commands for finds
// FindCommand fc = FindCommand.FIND_BY_AUTHOR;
//
// switch (fc) {
// case FIND_BY_CATEGORY:
// break;
// case FIND_BY_TITLE:
// break;
// case FIND_BY_AUTHOR:
// break;
// case FIND_BY_YEAR:
// break;
// default:
// // some comments
// }
