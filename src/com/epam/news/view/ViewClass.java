package com.epam.news.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class ViewClass {

    public static void main(String[] args) {
        System.out.println("Hello");

        // test commands for admin
        AdminCommand ac = AdminCommand.ADD_NEWS;
        switch (ac){
            case READ_ALL_NEWS:
                break;
            case SHOW_ALL_NEWS:
                break;

            case ADD_NEWS:
                break;
            case DELETE_NEWS:
                break;
            case EDIT_NEWS:
                break;

            case CREATE_USER:
                break;
            case BLOCK_USER:
                break;

            default:
                //some comments
        }

        // test commands for user
        UserCommand uc = UserCommand.RATE_NEWS;
        switch (uc){
            case REGISTER_USER:
                break;
            case SIGN_IN_USER:
                break;
            case SIGN_OUT_USER:
                break;

            case RATE_NEWS:
                break;

            default:
                //some comments
        }
    }

}

