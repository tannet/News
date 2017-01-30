package com.epam.news.dao.factory;

import com.epam.news.dao.impl.DBNewsDAO;
import com.epam.news.dao.impl.DBUserDAO;
import com.epam.news.dao.interfaces.NewsDAO;
import com.epam.news.dao.interfaces.UserDAO;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final NewsDAO dbNewsImpl = new DBNewsDAO();
    private final UserDAO dbUserImpl = new DBUserDAO();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public NewsDAO getBookDAO() {
        return dbNewsImpl;
    }

    public UserDAO getUserDAO() {
        return dbUserImpl;
    }

}
