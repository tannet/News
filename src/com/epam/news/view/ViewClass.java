package com.epam.news.view;

import java.util.Scanner;

import com.epam.news.bean.Book;
import com.epam.news.bean.Disk;
import com.epam.news.bean.Film;
import com.epam.news.bean.News;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ViewClass {

	public static void main(String[] args) {
		System.out.println("Hello");

		// test commands
		Command ac = Command.ADD_NEWS;
		Scanner sc = new Scanner (System.in);
		String newsToAdd = sc.nextLine();
		System.out.println(newsToAdd);
		//s.close();
		switch (ac) {
		case FIND_NEWS:
			findNews(ac);
			break;
		case ADD_NEWS:
			// addNews();
			initializeNewsToAdd(addNews(sc));
			break;
		case SHOW_ALL_NEWS:
			break;
		default:
			// some comments
		}

//		// test commands for finds
//		FindCommand fc = FindCommand.FIND_BY_AUTHOR;
//
//		switch (fc) {
//		case FIND_BY_CATEGORY:
//			break;
//		case FIND_BY_TITLE:
//			break;
//		case FIND_BY_AUTHOR:
//			break;
//		case FIND_BY_YEAR:
//			break;
//		default:
//			// some comments
//		}
	}

	//// SOME METHODS TO RUN THE CODE
	private static String addNews(Scanner sc) {
		System.out.println("Enter the news in format: ");
		System.out.println("Category / Title / Author / Year / Additional info ");
		//Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		String newsToAdd = sc.nextLine();
		return newsToAdd;
	}

	private static void initializeNewsToAdd(String s) {
		String category = s.split(" / ")[0];
		// System.out.println(category);
		News newsToAdd;
		if (category.equals("Book")) {
			newsToAdd = new Book();
			System.out.println(newsToAdd.toString());
		} else if (category.equals("Film")) {
			newsToAdd = new Film();
			System.out.println(newsToAdd.toString());
		} else if (category.equals("Disk")) {
			newsToAdd = new Disk();
			System.out.println(newsToAdd.toString());
		} else {
			System.out.println("No such category.");
		}
	}

	private static void findNews(Command ac) {System.out.println("Module 1 ");
	}
}
