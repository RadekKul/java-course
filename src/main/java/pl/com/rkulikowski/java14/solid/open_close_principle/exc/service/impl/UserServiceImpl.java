package pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.impl;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.domain.User;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.exception.UserNotFoundChecked;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.UserDao;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = Objects.requireNonNull(userDao); // to jest metoda dla Object, ktora pobiera wszystko oprocz null, jak ktos da nulla to odrazu sie wywala
    }


    @Override
    public User getUser() throws UserNotFoundChecked {  // robimy tak zeyb metoda zwracala nam juz nowego uzytkownika z bazy
        System.out.println("Director hard work....");
        return new User(userDao.getUserFromDb());     // to tak jakby dyrektorowi przekazac jakies dane ale on z tym nic nie robi
    }
}
