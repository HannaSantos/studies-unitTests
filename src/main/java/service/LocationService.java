package service;

import entity.Film;
import entity.Location;
import entity.User;
import utils.DateUtils;

import java.util.Date;

import static utils.DateUtils.addDays;

public class LocationService {

    public Location rentMovie(User user, Film film) {

        Location location = new Location();

        location.setFilm(film);
        location.setUser(user);
        location.setDateLocation(new Date());
        location.setPrice(film.getValueLocation());

        //Entrega no dia seguinte
        Date deadline = new Date();
        deadline = addDays(deadline, 1);
        location.setDateReturn(deadline);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return location;
    }

    public static void main(String[] args) {
        //cenario
        LocationService service = new LocationService();
        User user = new User("Usuario 1");
        Film film = new Film("Filme 1", 2, 5.0);

        //acao
        Location location = service.rentMovie(user, film);

        //verificacao
        System.out.println(location.getPrice() == 5.0);
        System.out.println(DateUtils.isSameDate(location.getDateLocation(), new Date()));
        System.out.println(DateUtils.isSameDate(location.getDateLocation(), DateUtils.getDateDifferenceDays(1)));
    }

}
