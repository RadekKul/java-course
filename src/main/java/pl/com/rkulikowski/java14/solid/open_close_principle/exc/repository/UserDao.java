package pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception.UserNotFoundChecked;

public interface UserDao {  //user date access object

    String getUserFromDb() throws UserNotFoundChecked;
}
