package ru.babushkina.week10.task1;

import java.util.HashMap;

public class Account {
    String login;
    String password;
    HashMap<String, String> credentials;

    public Account() {
        credentials = new HashMap<>();
    }

    public void checkLogin(String userLogin) throws WrongLoginException {
        if (userLogin == null || userLogin.length() <= 5 || userLogin.length() >= 20) {
            throw new WrongLoginException();
        } else {
            login = userLogin;
        }
    }

    public void checkPassword(String passWord, String confirmPassword) throws WrongPasswordException {
        if (passWord == null || passWord.length() <= 8 || passWord.length() >= 20 || !passWord.equals(confirmPassword)) {
            throw new WrongPasswordException();
        } else {
            password = passWord;
        }
    }

    public void addCredentials(String login, String password) {
        credentials.put(login, password);
    }

    public String checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException{
        if (credentials.containsKey(login) && credentials.get(login).equals(password)) {
            return "Вы успешно вошли в аккаунт!";
        } else {
            throw new WrongLoginOrPasswordException();
        }
    }
}
