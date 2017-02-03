package com.epam.news.dao.interfaces;

import com.epam.news.bean.News;

public interface NewsDAO {
    public void addNews(News news);

    public void deleteNews(News news);

    public void editNews(News news);
}

