package com.epam.news.service;

import com.epam.news.bean.User;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ValidationChecks {
    public static boolean checkValidEmail(String email){
        return false;
    }

    public static boolean checkValidPassword(String password){
        return false;
    }

    public static boolean checkUser(User user){
        return false;
    }

    public boolean checkDate(String date){
        try {
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
