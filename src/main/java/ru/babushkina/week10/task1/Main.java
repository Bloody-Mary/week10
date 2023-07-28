package ru.babushkina.week10.task1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        try {
            account.checkLogin("user123");
            System.out.println("Логин успешно создан");
            account.checkPassword("password123", "password123");
            System.out.println("Пароль успешно создан");
            account.addCredentials("user123", "password123");
//            System.out.println(account.checkLoginAndPassword("user123", "passord123"));
            System.out.println(account.checkLoginAndPassword("user123", "passord123"));
        } catch (WrongLoginException|WrongPasswordException|WrongLoginOrPasswordException e) {
            System.out.println("Исключение: " + e);
        }
    }
}













/*
            account.checkPassword("password123", "password123");
            System.out.println("Пароль успешно создан");
 */