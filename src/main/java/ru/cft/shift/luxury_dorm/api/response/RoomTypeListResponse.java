package ru.cft.shift.luxury_dorm.api.response;

public class RoomTypeListResponse {
    private Long id;
    private String name;
    private Integer area;
    private Integer max_products;
    private Float bonus;
    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getMax_products() {
        return max_products;
    }

    public void setMax_products(Integer max_products) {
        this.max_products = max_products;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomTypeListResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", max_products=" + max_products +
                ", bonus=" + bonus +
                ", price=" + price +
                '}';
    }

}
