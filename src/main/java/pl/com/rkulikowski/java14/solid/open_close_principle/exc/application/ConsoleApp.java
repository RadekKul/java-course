package pl.com.rkulikowski.java14.solid.open_close_principle.exc.application;

import pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.UserController;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.controller.impl.UserControllerImpl;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.UserDao;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.repository.impl.DbReader;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.UserService;
import pl.com.rkulikowski.java14.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleApp {   // stworzylismy typowa sciezke dla projektow, interfejsy poziom wyzej nad klasami ktore je implementuja, wyjatki w oddzielnym pakiecie itd

    public static void main(String[] args) {    // musimy zaczynac od gory czyli od usera przez View, przez Controller az do Modelu z danymi i service.
        UserDao dbDao = new DbReader(); // stwarzamy user i tak po prostu czytam z bazy danych, mozna by czytac z chmury (cloudReader) itp.
        UserService userService = new UserServiceImpl(dbDao);// tutaj tworzymy user service i jako implementacje interfejsu dajemy dbDao jako parametr
        UserController userController = new UserControllerImpl(userService);    // teraz lecimy dalej, laczymy controller z servicami, zebysmy mogli sterowac

        userController.renderUserpage();    // wywala sie bo rzucilismy na samym dole wyjatek w ConsoleCloudApp nie ruzcalismy wyjatku i sie nie wywalilo

    }
}
