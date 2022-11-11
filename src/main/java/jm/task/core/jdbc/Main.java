package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Херанука", "Пороялю", (byte) 23);
        userService.saveUser("Мояхата", "Сыровата", (byte) 31);
        userService.saveUser("Комуто", "Херовато", (byte) 35);
        userService.saveUser("Ятасука", "Накомоде", (byte) 22);
        userService.getAllUsers();
       // userService.cleanUsersTable();
       // userService.dropUsersTable();
    }
}
