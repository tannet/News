package com.epam.news.service.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.epam.news.bean.Book;
import com.epam.news.bean.Disk;
import com.epam.news.bean.Film;
import com.epam.news.bean.News;
import com.epam.news.dao.exception.DAOException;
import com.epam.news.dao.factory.DAOFactory;
import com.epam.news.service.FindByParameter;
import com.epam.news.service.Validator;
import com.epam.news.service.exception.ServiceException;
import com.epam.news.service.interfaces.PortalService;

public class PortalServiceImpl implements PortalService {
	private Scanner sc;

	@Override
	public void addNews(String newsToAdd) throws ServiceException {
		if (!Validator.isNewsToAddValid(newsToAdd)) {
			System.out.println("News to add is invalid. Please check your parameters.");
		} else if (Validator.isCategoryValid(newsToAdd.split(" / ")[0])) {
			// initializeNews(newsToAdd);
			try {
				DAOFactory.getInstance().getNewsDAO().addNews(newsToAdd);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
		} else {
			System.out.println("There is no such type of category. Please check your parameters.");
		}
	}

	@Override
	public void findNews(String newsToFind) throws ServiceException {
		sc = new Scanner(System.in);
		String searchIn = newsToFind.split(" ")[0];
		String searchFor = "";
		ArrayList<News> allNews = new ArrayList<>();
		System.out.println("Searching in category: " + searchIn + ". Enter the " + searchIn + " in valid format.");
		if (searchIn.equals("Category") || searchIn.equals("Title") || searchIn.equals("Author")) {
			searchFor = sc.nextLine();
			try {
				ArrayList<String> s = DAOFactory.getInstance().getNewsDAO().findNews();
				for (String st : s) {
					initializeNews(st, allNews);
				}
				// print(allNews);
				FindByParameter.find(searchIn, searchFor, allNews);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
		} else if (searchIn.equals("Year")) {
			searchFor = sc.nextLine();
			if (Validator.isYearValid(searchFor)) {
				try {
					ArrayList<String> s = DAOFactory.getInstance().getNewsDAO().findNews();
					for (String st : s) {
						initializeNews(st, allNews);
					}
					// print(allNews);
					print(FindByParameter.find(searchIn, searchFor, allNews));
				} catch (DAOException e) {
					throw new ServiceException(e);
				}
			}
		} else {
			System.out.println("There is no such type of search. Please check your parameters.");
		}
		// print(allNews);
	}

	private static void initializeNews(String s, ArrayList<News> allNews) throws ServiceException {
		String category = s.split(" / ")[0];
		News newsToAdd;
		if (category.equals("Book")) {
			newsToAdd = new Book(s);
			allNews.add(newsToAdd);
			// System.out.println(newsToAdd.toString());
		} else if (category.equals("Film")) {
			try {
				newsToAdd = new Film(s);
				allNews.add(newsToAdd);
				// System.out.println(newsToAdd.toString());
			} catch (NumberFormatException e) {
				throw new ServiceException(e);
			}
		} else if (category.equals("Disk")) {
			newsToAdd = new Disk(s);
			allNews.add(newsToAdd);
			// System.out.println(newsToAdd.toString());
		} else {
			System.out.println("No such category.");
		}
	}

	private static void print(ArrayList<News> n) {
		System.out.println("======================== PRINT ALL =============================");
		if(n.isEmpty()){
			System.out.println("Your request can not be found.");
		} else{
			for (News ne : n) {
				System.out.println(ne.toString());
			}
		}

	}
}
