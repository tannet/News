package com.epam.news.service.impl;

import com.epam.news.bean.Book;
import com.epam.news.bean.Disk;
import com.epam.news.bean.Film;
import com.epam.news.bean.News;
import com.epam.news.service.Validator;
import com.epam.news.service.interfaces.PortalService;

public class PortalServiceImpl implements PortalService {
	@Override
	public void addNews(String newsToAdd) {
		System.out.println(newsToAdd.split(" / ")[0] + " === " + Validator.isCategorValid(newsToAdd.split(" / ")[0]));
		if (!Validator.isNewsToAddValid(newsToAdd)) {
			System.out.println("News to add is invalid. Please check your parameters.");
		} else if (Validator.isCategorValid(newsToAdd.split(" / ")[0])) {
			
			initializeNewsToAdd(newsToAdd);
		} else{
			System.out.println("There is no such type of category. Please check your parameters.");
		}
		// REALISATION
	}

	@Override
	public void findNews(String newsToFind) {
		// REALISATION
	}

	public static void initializeNewsToAdd(String s) {
		String category = s.split(" / ")[0];
		System.out.println("INIT of "  + category);
		News newsToAdd;
		if (category.equals("Book")) {
			newsToAdd = new Book(s);
			System.out.println(newsToAdd.toString());
			// for(String st : s.split(" / ")) System.out.println(st);
		} else if (category.equals("Film")) {
			newsToAdd = new Film(s);
			System.out.println(newsToAdd.toString());
		} else if (category.equals("Disk")) {
			newsToAdd = new Disk(s);
			System.out.println(newsToAdd.toString());
		} else {
			System.out.println("No such category.");
		}
	}

}
