package entity;

public class User {

    private String name;

    public User() {}

    public User(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
