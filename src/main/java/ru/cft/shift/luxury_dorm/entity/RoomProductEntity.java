package ru.cft.shift.luxury_dorm.entity;

import javax.persistence.*;

import java.io.Serializable;

//@Embeddable
//class RoomProductKey implements Serializable {
//    @Column(name = "ProductID")
//    private Long productId;
//    @Column(name = "RoomID")
//    private Long roomId;
//
//    public RoomProductKey() {
//    }
//
//    public RoomProductKey(Long productId, Long roomId) {
//        this.productId = productId;
//        this.roomId = roomId;
//    }
//}

@Entity
@Table(name = "RoomProduct")
public class RoomProductEntity {
    @EmbeddedId
    RoomProductKey id;

    @Column(name = "Quantity")
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("ProductID")
    @JoinColumn(name = "ProductID")
    private ProductEntity product;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("RoomID")
    @JoinColumn(name = "RoomID")
    private RoomEntity room;

    public RoomProductKey getId() {
        return id;
    }

    public void setId(RoomProductKey id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }
}
