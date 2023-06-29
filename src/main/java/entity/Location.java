package entity;

import java.util.Date;

public class Location {

    private User user;
    private Film film;
    private Date dateLocation;
    private Date dateReturn;
    private Double price;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Date getDateLocation() {
        return dateLocation;
    }
    public void setDateLocation(Date dateLocation) {
        this.dateLocation = dateLocation;
    }
    public Date getDateReturn() {
        return dateReturn;
    }
    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = film;
    }

}
