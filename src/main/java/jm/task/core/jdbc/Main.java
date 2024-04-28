package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван","Григорьев", (byte) 34);
        userService.saveUser("Елена","Премудрая", (byte) 15);
        userService.saveUser("Виктор","Богатырёв", (byte) 54);
        userService.saveUser("Клавдия","Кирулёва", (byte) 96);
        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
