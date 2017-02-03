package com.epam.news.dao.interfaces;

import com.epam.news.bean.User;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public interface UserDAO {
    public void register(User user);

    public void signIn(String email, String password);
}
