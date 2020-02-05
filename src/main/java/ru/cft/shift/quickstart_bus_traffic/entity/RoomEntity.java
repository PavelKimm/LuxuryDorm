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
    public String name;
    @ManyToOne(cascade = CascadeType.ALL)
    public RoomTypeEntity roomType;

    public void setName(String name) {
        this.name = name;
    }
    public void setRoomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
    }
}
