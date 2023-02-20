package ru.top.core;

import java.util.*;

public class Task2 {
    /*Необходимо разработать приложение, которое позволит сохранять информацию о
    логинах пользователей и их паролях. Каждому пользователю соответствует пара
    логин - пароль. При старте приложение отображается меню:
    1. Добавить нового пользователя.
    2. Удалить существующего пользователя.*/

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добавить нового пользователя - нажмите 1\n" +
                    "Удалить существующего пользователя - нажмите 2\n" +
                    "Посмотреть список пользователей - нажмите 3\n" +
                    "Выйти из приложения - нажмите 4");
            String input = scanner.next();
            switch (input) {
                case "1":
                    System.out.println("Введите логин нового пользователя: ");
                    String username = scanner.next();
                    System.out.print("Введите пароль нового пользователя: ");
                    String password = scanner.next();
                    users.put(username, password);
                    System.out.println("Пользователь " + username + " добавлен.");
                    break;
                case "2":
                    System.out.print("Введите логин пользователя, которого нужно удалить: ");
                    String userToDelete = scanner.next();
                    if (users.containsKey(userToDelete)) {
                        users.remove(userToDelete);
                        System.out.println("Пользователь " + userToDelete + " удален.");
                    } else {
                        System.out.println("Пользователь " + userToDelete + " не найден.");
                    }
                    break;
                case "3":
                    for(Map.Entry<String, String> entry: users.entrySet()) {
                        String key = entry.getKey();
                        String user = entry.getValue();
                        System.out.println(key + " - " + user);
                    }
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ошибка!");
                    break;
            }
        }

    }
}
