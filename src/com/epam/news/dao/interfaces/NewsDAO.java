package com.epam.news.dao.interfaces;

import java.util.ArrayList;

import com.epam.news.dao.exception.DAOException;

public interface NewsDAO {
    public void addNews(String newsToAdd) throws DAOException;

    public ArrayList<String> findNews() throws DAOException;
}

