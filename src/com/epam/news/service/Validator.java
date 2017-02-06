package com.epam.news.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean isNewsToAddValid(String newsToAdd) {
		Pattern p = Pattern.compile(
				"^([^/]+(\\s/\\s))([^/]+(\\s/\\s))([^/]+(\\s/\\s))((189[6-9]|19[0-9][0-9]|20[0|1][0-7])(\\s/\\s))(((10(\\.0)?)|([0-9]\\.[0-9]))|((\\d){0,3}:(([0-5][0-9])|(60)))|(\\w)+)$");
		Matcher m = p.matcher(newsToAdd);
		return m.matches();
	}

	public static boolean isCategoryValid(String category) {
		if (category.equals("Book") || category.equals("Film") || category.equals("Disk")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isYearValid(String search) {
		try {
			int year = Integer.parseInt(search);
			if (year <= 2017 && year >= 1896) {
				return true;
			} else {
				System.out.println("Year must be integer number between 1896 and 2017.");
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
