package com.epam.news.service.interfaces;

import com.epam.news.bean.News;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public interface PortalService {
    public void addNews(News news);

    public void deleteNews(News news);

    public void editNews(News news);
}
