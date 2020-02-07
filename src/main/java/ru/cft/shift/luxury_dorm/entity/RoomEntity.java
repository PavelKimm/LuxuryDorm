package ru.cft.shift.luxury_dorm.entity;

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

    public RoomTypeEntity getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEntity roomType) {
        this.roomType = roomType;
    }

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
}
