package pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.impl;


import pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.UserController;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception.UserNotFoundChecked;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = Objects.requireNonNull(userService);
    }

    @Override
    public String renderUserpage() {
        System.out.println("Making html with user data");
        String html = "";
        try {
            userService.getUser();
        } catch (UserNotFoundChecked userNotFoundChecked) {
            userNotFoundChecked.printStackTrace();
        }
        return html;
    }
}
