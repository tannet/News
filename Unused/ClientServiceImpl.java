package com.epam.news.service.impl;

import com.epam.news.bean.User;
import com.epam.news.dao.factory.DAOFactory;
import com.epam.news.dao.interfaces.UserDAO;
import com.epam.news.service.interfaces.ClientService;
import com.epam.news.service.ValidationChecks;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ClientServiceImpl extends ValidationChecks implements ClientService {
    @Override
    public void register(User user) {
        if (checkUser(user)) {

        } else {
            // ???
            System.out.println("Validation failed. Try again.");
        }
    }

    @Override
    public void signIn(String email, String password) {
        // проверяем параметры
        if (checkValidEmail(email) && checkValidPassword(password)) {
            // реализуем функционал логинации пользователя в системе
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.signIn(email, password);
        } else {
            // ???
            System.out.println("Validation failed. Try again.");
        }

        //....
    }

    @Override
    public void signOut(String email) {
        if (checkValidEmail(email)) {

        } else {
            // ???
            System.out.println("Validation failed. Try again.");
        }
    }
}
