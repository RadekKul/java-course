package pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.impl;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception.UserNotFoundChecked;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.UserDao;

public class DbReader implements UserDao {

    @Override
    public String getUserFromDb() throws UserNotFoundChecked {
        throw new UserNotFoundChecked("NOT FOUND!!!!");
    }
}
