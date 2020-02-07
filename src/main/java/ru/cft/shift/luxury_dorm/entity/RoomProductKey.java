package ru.cft.shift.luxury_dorm.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoomProductKey implements Serializable {
    @Column(name = "ProductID")
    private Long productId;
    @Column(name = "RoomID")
    private Long roomId;

    public RoomProductKey() {
    }

    public RoomProductKey(Long productId, Long roomId) {
        this.productId = productId;
        this.roomId = roomId;
    }
}