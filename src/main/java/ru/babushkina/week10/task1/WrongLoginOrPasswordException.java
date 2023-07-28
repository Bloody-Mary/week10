package ru.babushkina.week10.task1;

public class WrongLoginOrPasswordException extends Exception{
    public WrongLoginOrPasswordException() {
        super("Неправильный логин или пароль!");
    }
}
