package com.epam.news.dao.impl;

import com.epam.news.bean.News;
import com.epam.news.dao.interfaces.NewsDAO;
import com.epam.news.dao.factory.DAOFactory;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class DBNewsDAO implements NewsDAO {

    @Override
    public void addNews(News news) {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        NewsDAO bookDAO = daoObjectFactory.getBookDAO();
        bookDAO.addNews(news);
    }

    @Override
    public void deleteNews(News news) {

    }

    @Override
    public void editNews(News news) {

    }
}
