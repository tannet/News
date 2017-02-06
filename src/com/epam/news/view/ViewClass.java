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
			System.out.println("ERROR: " + e);
		}
	}
}
