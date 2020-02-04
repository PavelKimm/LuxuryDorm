package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Balance")
    private Float balance;
    @OneToOne(cascade = CascadeType.ALL)
    private RoomEntity room;
}
