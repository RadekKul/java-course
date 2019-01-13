package pl.com.rkulikowski.java14.solid.open_close_principle.exc.service;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.domain.User;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception.UserNotFoundChecked;

public interface UserService {

    User getUser() throws UserNotFoundChecked;
}
