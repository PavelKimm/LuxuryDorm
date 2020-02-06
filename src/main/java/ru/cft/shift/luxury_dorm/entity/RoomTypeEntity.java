package ru.cft.shift.luxury_dorm.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "RoomType")
public class RoomTypeEntity {
    @Id
    @Column(name = "RoomTypeID")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "TypeName")
    private String name;
    @Column(name = "Area")
    private Integer area;
    @Column(name = "MaxProducts")
    private Integer maxProductQuantity;
    @Column(name = "Price")
    private Float price;
    @Column(name = "Bonus")
    private Float bonus;

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

    public Integer getMaxProductQuantity() {
        return maxProductQuantity;
    }

    public void setMaxProductQuantity(Integer maxProductQuantity) {
        this.maxProductQuantity = maxProductQuantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }
}
