package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Embeddable
class RoomProductKey implements Serializable {
    @Column(name = "ProductID")
    private Long productId;
    @Column(name = "RoomID")
    private Long roomId;
}

@Entity
@Table(name = "RoomProduct")
public class RoomProductEntity {
    @EmbeddedId
    RoomProductKey id;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("ProductID")
    @JoinColumn(name = "ProductID")
    private ProductEntity product;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("RoomID")
    @JoinColumn(name = "RoomID")
    private RoomEntity room;
}
