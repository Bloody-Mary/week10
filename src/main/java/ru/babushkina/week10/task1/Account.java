package ru.babushkina.week10.task1;

public class Account {
    String login;

    public Account(String login) {
        this.login = login;
    }

    public static boolean checkLogin (String login) {
        if (login == null) {
            return false;
        }
        return login.length() > 5 && login.length() < 20;
    }
}
