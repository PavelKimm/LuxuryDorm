package ru.cft.shift.luxury_dorm.api.response;

import java.util.List;

public class RoomResponse {
    private Long id;
    private String name;
    private String room_type;
    private Integer area;
    private Integer max_product;
    private Integer product_count;
    private List<ProductCountResponse> products;

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

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getMax_product() {
        return max_product;
    }

    public void setMax_product(Integer max_product) {
        this.max_product = max_product;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public List<ProductCountResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductCountResponse> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "RoomResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", room_type='" + room_type + '\'' +
                ", area=" + area +
                ", max_product=" + max_product +
                ", product_count=" + product_count +
                ", products=" + products +
                '}';
    }
}
