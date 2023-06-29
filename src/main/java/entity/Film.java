package entity;

public class Film {

    private String name;
    private Integer stock;
    private Double valueLocation;

    public Film() {}

    public Film(String name, Integer stock, Double valueLocation) {
        this.name = name;
        this.stock = stock;
        this.valueLocation = valueLocation;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Double getValueLocation() {
        return valueLocation;
    }
    public void setValueLocation(Double valueLocation) {
        this.valueLocation = valueLocation;
    }

}
