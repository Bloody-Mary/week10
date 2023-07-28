package ru.babushkina.week10.task1;

public class WrongLoginException extends Exception {
    public WrongLoginException () {
        super("Неправильный логин! Пожалуйста, убедитесь, что он соответствует требованиям: его длина должна быть больше 5 и меньше 20!");
    }
}
