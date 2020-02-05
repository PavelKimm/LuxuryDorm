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

    public void setName(String name) {
        this.name = name;
    }
    public void setArea(Integer area) {
        this.area = area;
    }
    public void setMaxProductQuantity(Integer maxProductQuantity) {
        this.maxProductQuantity = maxProductQuantity;
    }
}
