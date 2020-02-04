package ru.cft.shift.quickstart_bus_traffic.entity;

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
    private int maxProductQuantity;
}
