package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Room")
public class RoomEntity {
    @Id
    @Column(name = "RoomID")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    private RoomTypeEntity roomType;
}
