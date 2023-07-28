package ru.babushkina.week10.task1;

public class WrongPasswordException extends Exception{
    public WrongPasswordException () {
        super("Неправильный пароль!");
    }
}
