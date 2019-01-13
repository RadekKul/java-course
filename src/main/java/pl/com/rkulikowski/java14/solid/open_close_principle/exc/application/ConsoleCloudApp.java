package pl.com.rkulikowski.java14.solid.open_close_principle.exc.application;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.UserController;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.impl.UserControllerImpl;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.UserDao;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.impl.CloudReader;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.UserService;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleCloudApp {

    public static void main(String[] args) {

        UserDao userDao = new CloudReader();
        UserService userService = new UserServiceImpl(userDao);
        UserController userController = new UserControllerImpl(userService);

        userController.renderUserpage();    // tu sie nie wywali bo na najnizszym poziomie nie rzucamy wyjatku, a w ConsoleApp sie wywalalo bo byl wyjatek w DbReader
    }
}
