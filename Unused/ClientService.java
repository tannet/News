package com.epam.news.service.interfaces;

import com.epam.news.bean.User;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public interface ClientService {
    public void register(User user);

    public void signIn(String email, String password);

    public void signOut(String email);
}
