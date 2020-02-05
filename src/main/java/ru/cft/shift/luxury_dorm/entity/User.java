package ru.cft.shift.luxury_dorm.entity;

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

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }
}
