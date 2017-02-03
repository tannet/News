package com.epam.news.dao.impl;

import com.epam.news.bean.User;
import com.epam.news.dao.interfaces.UserDAO;
import com.epam.news.dao.factory.DAOFactory;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class DBUserDAO implements UserDAO {
    @Override
    public void register(User user) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        userDAO.register(user);
    }

    @Override
    public void signIn(String email, String password) {

    }
}
